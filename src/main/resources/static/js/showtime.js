$(document).ready(function () {
    var time = $.ajax({
        url: "/getTime",
        method: "GET"
    });
    time.done(function (data) {
        $('#time').append(data)
    });
    time.fail(function (jqXHR, textStatus) {
        console.log("Error in fetching time");
    })
});
