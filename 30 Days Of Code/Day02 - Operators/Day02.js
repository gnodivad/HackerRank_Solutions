function main() {
    var mealCost = parseFloat(readLine());
    var tipPercent = Number(readLine());
    var taxPercent = Number(readLine());

    var total = mealCost + mealCost * (tipPercent / 100) + mealCost * (taxPercent / 100);
    console.log("The total meal cost is " + Math.round(total) + " dollars.");
}
