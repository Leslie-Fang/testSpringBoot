$(document).ready(function(){
//    alert("Ready");

    $('#logonButton').click(function(){
//        alert("Login");
//        alert($("#username").val());
//        alert($("#password").val());
        var username=$("#username").val();
        var password=$("#password").val();
        var data = {"id":10, "name":username,"password":password};
        $.ajax({
          type: 'POST',
          url: '/logon',
          contentType:'application/json',
          data: JSON.stringify(data),
          dataType: 'json'
        }).always(function(data){
            console.log(data);
            console.log(typeof(data));
//            console.log("true");
//            console.log(typeof("true"));
            if(data){
                window.location.assign("/login");
            }else{
                window.location.assign("/logon");
            }
        });
    });
});