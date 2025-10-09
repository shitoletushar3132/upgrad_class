const apiKey = "cur_live_u494SfRh9UABbT9dFLO7IscFG2Ejr93Krd2tqVPr";
const currenciesUrl = `https://api.currencyapi.com/v3/currencies?apikey=${apiKey}`;
const latestUrl = `https://api.currencyapi.com/v3/latest?apikey=${apiKey}`;

const amountInput = document.getElementById("amount");
const fromCurrency = document.getElementById("fromCurrency");
const toCurrency = document.getElementById("toCurrency");
const convertBtn = document.getElementById("convertBtn");
const resultDiv = document.getElementById("result");

let rates = {};
let allCurrencies = {};

async function fetchCurrencies() {
  try {
    const response = await fetch(currenciesUrl);
    const data = await response.json();
    allCurrencies = data.data;

    for (let code in allCurrencies) {
      const optionFrom = document.createElement("option");
      optionFrom.value = code;
      optionFrom.textContent = `${code} - ${allCurrencies[code].name}`;
      fromCurrency.appendChild(optionFrom);

      const optionTo = document.createElement("option");
      optionTo.value = code;
      optionTo.textContent = `${code} - ${allCurrencies[code].name}`;
      toCurrency.appendChild(optionTo);
    }

    fromCurrency.value = "USD";
    toCurrency.value = "EUR";
  } catch (error) {
    console.error("Error fetching currencies:", error);
    resultDiv.textContent = "Failed to fetch currencies.";
  }
}

async function fetchRates() {
  try {
    const response = await fetch(latestUrl);
    const data = await response.json();
    rates = {};
    for (let currency in data.data) {
      rates[currency] = data.data[currency].value;
    }
  } catch (error) {
    console.error("Error fetching rates:", error);
    resultDiv.textContent = "Failed to fetch rates.";
  }
}

function convertCurrency() {
  const amount = parseFloat(amountInput.value);
  const from = fromCurrency.value;
  const to = toCurrency.value;

  if (isNaN(amount)) {
    resultDiv.textContent = "Please enter a valid number.";
    return;
  }

  if (rates[from] == rates[to]) {
    resultDiv.textContent =
      "Conversion rates not available for selected currency.";
    from = "";
    to = "";
    return;
  }

  if (!rates[from] || !rates[to]) {
    resultDiv.textContent =
      "Conversion rates not available for selected currency.";
    return;
  }

  const converted = (amount / rates[from]) * rates[to];
  resultDiv.textContent = `${amount} ${from} = ${converted.toFixed(2)} ${to}`;
}

async function init() {
  await fetchCurrencies();
  await fetchRates();
}

function updateDropdowns() {
  const fromValue = fromCurrency.value;
  const toValue = toCurrency.value;

  Array.from(fromCurrency.options).forEach(
    (option) => (option.disabled = false)
  );
  Array.from(toCurrency.options).forEach((option) => (option.disabled = false));

  if (fromValue) {
    Array.from(toCurrency.options).forEach((option) => {
      if (option.value === fromValue) option.disabled = true;
    });
  }
  if (toValue) {
    Array.from(fromCurrency.options).forEach((option) => {
      if (option.value === toValue) option.disabled = true;
    });
  }
}

fromCurrency.addEventListener("change", updateDropdowns);
toCurrency.addEventListener("change", updateDropdowns);
convertBtn.addEventListener("click", convertCurrency);

init();
