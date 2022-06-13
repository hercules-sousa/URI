const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", (line) => {
  let num = Number(line);

  if (num >= 0 && num <= 25.0) {
    console.log("Intervalo [0,25]");
  } else {
    if (num >= 25.00001 && num <= 50.0) {
      console.log("Intervalo (25,50]");
    } else {
      if (num >= 50.00001 && num <= 75.0) {
        console.log("Intervalo (50,75]");
      } else {
        if (num >= 75.00001 && num <= 100.0) {
          console.log("Intervalo (75,100]");
        } else {
          console.log("Fora de intervalo");
        }
      }
    }
  }

  rl.close();
});
