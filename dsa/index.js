function fibonacci(n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

process.on('message', (msg) => {
    const result = fibonacci(msg.number);
    process.send(result);
});
