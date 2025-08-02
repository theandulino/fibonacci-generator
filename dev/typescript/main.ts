import * as readline from 'readline';

function fibonacci(n: number): number[] {
    if (n <= 0) return [];
    if (n === 1) return [0];
    const seq = [0, 1];
    for (let i = 2; i < n; i++) {
        seq.push(seq[i - 1] + seq[i - 2]);
    }
    return seq;
}

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('How many Fibonacci numbers? ', (answer) => {
    const n = parseInt(answer.trim(), 10);
    if (isNaN(n) || n < 0) {
        console.log('Please enter a valid non-negative integer.');
    } else {
        console.log('Fibonacci sequence:');
        console.log(fibonacci(n).join(', '));
    }
    rl.close();
});