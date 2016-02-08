/**
 * Created by Serg Bash on 01.02.2016.
 */
$( document ).ready(function() {
    $("#buddies").click(function () {
        //$("#content").html("buddies");
       // history.pushState({foo: 'bar'}, 'buddies', '/buddies.html')
        $("#content").html($("#b1").text())
    });

    $("#groups").click(function () {
        //$("#content").html("groups");
        //history.pushState({foo: 'bar'}, 'groups', '/groups.html')
        $("#content").html($("#g1").text())
    });

    $("#events").click(function () {
        //$("#content").html("events");
       // history.pushState({foo: 'bar'}, 'events', '/events.html')
        $("#content").html($("#e1").text())
    });

    $("#challenges").click(function () {
       // $("#content").html("challenges");
       // history.pushState({foo: 'bar'}, 'challenges', '/challenges.html')
        $("#content").html($("#c1").text())
    });
});