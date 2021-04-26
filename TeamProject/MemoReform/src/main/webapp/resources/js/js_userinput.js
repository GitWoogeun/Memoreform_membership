$(function () {
  $("#submit").click(function () {
    if ($("#email").val().trim() == "") {
      alert("email을 입력 해주세요");
      $("#email").focus();
      return;
    }
    //#submit을 클릭시 위에조건들을 다 건너 띄고 데이터에 전송한다.
    //button type이 submit이 아닌 button으로 되있을때 전송하는 방법
    $("form").submit();
  });

  function email_check(email) {
    var regex = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    return regex.test(email);
  }

  //email / keyUp
  $("#Check").click(function () {
    $.ajax({
      type: "post",
      url: "emailCheck",
      data: { email: $("#email").val() },
      contentType: "application/x-www-form-urlencoded;charset=UTF-8",
      success: function (data) {
        console.log($("#email").val());
        if (email_check($("#email").val())) {
          //형식은 맞았지만 서버에 중복체크
          //Ok = DB에 중복이 없음.
          if (data == "Ok") {
            $("#emailCheckResult")
              .css("color", "lightgreen")
              .text("아주 멋진 아이디입니다. Let's Go!!");
            $("#submit").removeAttr("disabled");
          }
          // DB에 중복값이 있을때
          else {
            $("#emailCheckResult")
              .css("color", "red")
              .text("중복된 아이디입니다. Let's Back!!");
            $("#submit").attr("disabled", "disabled");
          }
        } else {
          alert("이메일 형식이 틀렸습니다.");
          $("#email").val("").focus();
        }
      },
    });
  });
});
// else if (!email_check($("#email").val())) {
//   alert("이메일 형식이 틀렸을때");
// }
