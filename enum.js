var day = "monday";
// ==, ===
var daysOfTheWeek;
(function (daysOfTheWeek) {
    daysOfTheWeek[daysOfTheWeek["sun"] = 0] = "sun";
    daysOfTheWeek[daysOfTheWeek["mon"] = 1] = "mon";
    daysOfTheWeek[daysOfTheWeek["tues"] = 2] = "tues";
    daysOfTheWeek[daysOfTheWeek["wed"] = 3] = "wed";
    daysOfTheWeek[daysOfTheWeek["thurs"] = 4] = "thurs";
    daysOfTheWeek[daysOfTheWeek["fri"] = 100] = "fri";
    daysOfTheWeek[daysOfTheWeek["sat"] = 101] = "sat";
})(daysOfTheWeek || (daysOfTheWeek = {}));
var dayIs;
dayIs = daysOfTheWeek.fri;
console.log(dayIs);
if (dayIs === daysOfTheWeek.fri) {
    console.log(" weekend starts");
}