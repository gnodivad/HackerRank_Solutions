function processData(input) {
    input = input.split("\n");

    for (var i = 1; i <= input[0]; i++) {
        var word = input[i];
        var even = word
            .split("")
            .filter((value, index) => index % 2 == 0)
            .join("");
        var odd = word
            .split("")
            .filter((value, index) => index % 2 != 0)
            .join("");
        console.log(even + " " + odd);
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function(input) {
    _input += input;
});

process.stdin.on("end", function() {
    processData(_input);
});
