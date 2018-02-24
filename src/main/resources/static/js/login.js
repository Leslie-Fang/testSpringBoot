$(document).ready(function(){
    alert("Ready");

    $('#loginButton').click(function(){
        alert("Login");
        alert($("#username").val());
        alert($("#password").val());
        var username=$("#username").val();
        var password=$("#password").val();
        var data = {"id":4, "name":username,"password":password};
        $.ajax({
          type: 'POST',
          url: '/login',
          contentType:'application/json',
          data: JSON.stringify(data),
          dataType: 'json'
        }).done(function(){
            alert("Post Success!");
        });
    });
});