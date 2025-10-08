const apiKey = "508e65af6d019e55904d0b72c1d2d907"; // Replace with your OpenWeatherMap API key

document.getElementById("getWeather").addEventListener("click", async () => {
  const city = document.getElementById("cityInput").value.trim();
  if (!city) return alert("Please enter a city name");

  try {
    const res = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`
    );
    if (!res.ok) throw new Error("City not found");

    const data = await res.json();
    showWeather(data);
  } catch (err) {
    document.getElementById("data").innerHTML = `
      <div class="alert alert-danger" role="alert">
        ${err.message}
      </div>
    `;
  }
});

function showWeather(weather) {
  const { name, main, weather: w, wind } = weather;
  const iconUrl = `https://openweathermap.org/img/wn/${w[0].icon}@2x.png`;

  document.getElementById("data").innerHTML = `
    <div id="weatherCard" class="card mx-auto p-3 bg-light">
      <h3 class="card-title">${name}</h3>
      <img src="${iconUrl}" alt="${w[0].description}" class="weather-icon" />
      <p class="h4">${main.temp} °C</p>
      <p class="text-capitalize">${w[0].description}</p>
      <ul class="list-group list-group-flush">
        <li class="list-group-item">Humidity: ${main.humidity}%</li>
        <li class="list-group-item">Wind: ${wind.speed} m/s</li>
        <li class="list-group-item">Feels like: ${main.feels_like} °C</li>
      </ul>
    </div>
  `;
}
