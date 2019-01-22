function main() {
    var i = 4;
    var d = 4.0;
    var s = "HackerRank ";
    // Declare second integer, double, and String variables.
    var i2;
    var d2;
    var s2;
    // Read and save an integer, double, and String to your variables.
    i2 = readLine();
    d2 = readLine();
    s2 = readLine();
    // Print the sum of both integer variables on a new line.
    console.log(i + Number(i2));
    // Print the sum of the double variables on a new line.
    console.log((d + Number(d2)).toFixed(1));
    // Concatenate and print the String variables on a new line
    // The 's' variable above should be printed first.
    console.log(s + s2);
}
