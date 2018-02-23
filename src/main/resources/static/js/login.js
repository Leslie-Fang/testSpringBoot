$(document).ready(function(){
    alert("Ready");

    $('#loginButton').click(function(){
        alert("Login");
        alert($("#username").val());
        alert($("#password").val());
        var username=$("#username").val();
        var password=$("#password").val();
        var data = {"username":username,"password":password};
//        $.ajax({
//          type: 'POST',
//          url: '/login',
//          data: data,
//          success: success,
//        });
    });
});