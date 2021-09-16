<script type="text/javascript">
function loginValidation(){

	var id = $("#id").val();
	var password = $("#password").val();

	if(!id){
		alert("아이디를 입력하세요.");
		$("#id").focus();
		return false;
	}else if(!password){
		alert("비밀번호를 입력하세요.");
		$("#password").focus();
		return false;
	}else {
		login(id,password);
	}

}

function login(id,password){

	$.ajax({

		url : "/jquery/login",
		type : 'POST',
		data : { id : id,
				password : password
		},
		success:function(data){
			if(data == 2){
				alert("아이디 혹은 비밀번호가 맞지 않습니다.");
				return false;
			}else if(data == 3){
				location.href="/view/dashboard";
			}
		}

	})

}

function enterKeyCheck(){

 if(event.keyCode == 13)
	  {
	 loginValidation();
	  }


}


  //로그인 상태에 따라 로그인, 로그아웃 메뉴 노출 바꾸게하기
  String loginState; //로그인 상태 표시해주는 변수
  String loginState1;
  if (session.getAttribute("name") == null) { // 로그인 id가져오기
  loginState = hidden;//로그인 안된 상태일 경우
  loginState1= visible;
  } else {
  loginState = true; // 로그인 된 상태일 경우
  loginState = visible;
  }
