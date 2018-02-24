$(document).ready(function(){
//    alert("Ready");

    $('#loginButton').click(function(){
//        alert("Login");
//        alert($("#username").val());
//        alert($("#password").val());
        var username=$("#username").val();
        var password=$("#password").val();
        var data = {"id":3, "name":username,"password":password};
        $.ajax({
          type: 'POST',
          url: '/login',
          contentType:'application/json',
          data: JSON.stringify(data),
          dataType: 'json'
        }).always(function(data){
            console.log(data);
            console.log(typeof(data));
//            console.log("true");
//            console.log(typeof("true"));
            if(data){
                window.location.assign("/testURL2");
            }else{
                window.location.assign("/login");
            }
        });
    });
});