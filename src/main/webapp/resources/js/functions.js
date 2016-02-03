/**
 * Created by Serg Bash on 01.02.2016.
 */
$( document ).ready(function() {
    $("#buddies").click(function () {
        $("#content").html("buddies");
       // $("#buddiesDiv").visibility("true");
        history.pushState({foo: 'bar'}, 'Title', '/baz.html')
    });

    $("#groups").click(function () {
        $("#content").html("groups");
    });

    $("#events").click(function () {
        $("#content").html("events");
    });

    $("#challenges").click(function () {
        $("#content").html("challenges");
    });
});