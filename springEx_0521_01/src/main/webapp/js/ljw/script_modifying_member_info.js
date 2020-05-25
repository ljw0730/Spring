/**
 * 
 */
$(document).ready(function() {
	$(".main_menu_list>a").mouseenter(function() {
		$(this).css({
			"border-bottom": "3px solid red"
		});
	});
	
	$(".main_menu_list>a").mouseleave(function() {
		$(this).css({
			"border-bottom": "0px"
		});
	});
	
	$("#postal_btn").mouseenter(function() {
		$(this).css({
			"cursor": "pointer"
		});
	});
	
	$("#mail_tail_dropbox").change(function() {

		var index = document.getElementById("mail_tail_dropbox").selectedIndex;
		switch(index) {
			case 1:
				$("#mail_tail").val("gmail.com");
				break;
			case 2:
				$("#mail_tail").val("naver.com");
				break;
			case 3:
				$("#mail_tail").val("nate.com");
				break;
			case 4:
				$("#mail_tail").val("hotmail.com");
				break;
			case 5:
				$("#mail_tail").val("paran.com");
				break;
			case 6:
				$("#mail_tail").val("empal.com");
				break;
			case 7:
				$("#mail_tail").val("yahoo.com");
				break;
			case 8:
				$("#mail_tail").val("dreamwiz.com");
				break;
			case 9:
				$("#mail_tail").val("hanmail.net");
				break;
				
		}
		
		
	})
	
});

function open_address_postal() {
	
	// 새창 띄우기 (팝얼할 파일이름, 팝업창 아이디, 팝업창 옵션)
	window.open(
			"postal.html",
			"postal_input",
			"width=600, height=400, resizable=no, scrollbars=no"
	);
}

function modifying_input_formcheck() {
	
	// 비밀번호 체크
	const pwRegex1 = /[A-Za-z]/
	const pwRegex2 = /\d/
	const pwRegex3 = /[!@#\$%\^&\*\(\)\-=`~\[\]\\\{\}\|;':",\.\/<>\?_]/
	let pwTypeNum = 0;

	if(modifying.pw1.value == "") {
		alert('비밀번호를 입력해 주세요.')
		modifying.pw1.focus()
		return false
	}
	
	if (pwRegex1.test(modifying.pw1.value)) pwTypeNum++
	if (pwRegex2.test(modifying.pw1.value)) pwTypeNum++
	if (pwRegex3.test(modifying.pw1.value)) pwTypeNum++

	if (pwTypeNum < 2) {
		alert('영문, 숫자, 특수문자 중 적어도 2종류 이상을 조합하여 비밀번호를 만들어주세요.')
		modifying.pw1.focus()
		return false
	}

	if (pwTypeNum === 2 && modifying.pw1.value.length < 10) {
		alert('영문, 숫자, 특수문자 중 2종류 조합 시 비밀번호는 10자리 이상 입력해야 합니다.')
		modifying.pw1.focus()
		return false
	}

	if (pwTypeNum === 3 && modifying.pw1.value.length < 8) {
		alert('영문, 숫자, 특수문자 모두 조합 시 비밀번호는 8자리 이상 입력해야 합니다.')
		modifying.pw1.focus()
		return false
	}

	// 비밀번호 확인입력 체크
	if(modifying.pw2.value == "") {
		alert('비밀번호 확인을 입력해 주세요.')
		modifying.pw2.focus()
		return false
	}
	
	if (modifying.pw1.value !== modifying.pw2.value) {
		alert('입력한 비밀번호가 확인란과 일치하지 않습니다.')
		modifying.pw2.focus()
		return false
	}

	// 이메일 체그
	if(modifying.mail_id.value == "") {
		alert('이메일을 입력해 주세요.')
		modifying.mail_id.focus()
		return false
	}
	if(modifying.main_tail.value == "") {
		alert('이메일을 입력해 주세요.')
		modifying.main_tail.focus()
		return false
	}
	
	// 주소 체크
	const adressRegex = /\d/
	
	if(modifying.f_postal.value == "") {
		alert('우편번호 앞자리를 입력해 주세요.')
		modifying.f_postal.focus()
		return false
	}
	if (!adressRegex.test(modifying.f_postal.value)) {
		alert('우편번호는 숫자만 입력해야 합니다.')
		modifying.f_postal.focus()
		return false
	}
	
	if(modifying.l_postal.value == "") {
		alert('우편번호 뒷자리를 입력해 주세요.')
		modifying.l_postal.focus()
		return false
	}
	if (!adressRegex.test(modifying.l_postal.value)) {
		alert('우편번호는 숫자만 입력해야 합니다.')
		modifying.l_postal.focus()
		return false
	}
	
	if(modifying.address1.value == "") {
		alert('주소를 입력해 주세요.')
		modifying.address1.focus()
		return false
	}
	if(modifying.address2.value == "") {
		alert('상세주소를 입력해 주세요.')
		modifying.address2.focus()
		return false
	}
	
	// 전화번호 체크
	const telRegex = /^\d+$/
	if(modifying.f_tell.value == "") {
		alert('전화번호를 입력해 주세요.')
		modifying.f_tell.focus()
		return false
	}
	if(modifying.m_tell.value == "") {
		alert('전화번호를 입력해 주세요.')
		modifying.m_tell.focus()
		return false
	}
	if(modifying.l_tell.value == "") {
		alert('전화번호를 입력해 주세요.')
		modifying.l_tell.focus()
		return false
	}
		
	if (!telRegex.test(modifying.f_tell.value) || !telRegex.test(modifying.m_tell.value) || !telRegex.test(modifying.l_tell.value)) {
		alert('전화번호는 숫자만 입력해야 합니다.')
		return false
	}
	
	
	// 생년월일 체크
	if(modifying.birth_year.value == "0") {
		alert('출생년도를 선택해 주세요.')
		modifying.birth_year.focus()
		return false
	}
	if(modifying.birth_month.value == "0") {
		alert('출생월를 선택해 주세요.')
		modifying.birth_month.focus()
		return false
	}
	if(modifying.birth_day.value == "0") {
		alert('출생월를 선택해 주세요.')
		modifying.birth_day.focus()
		return false
	}
	
	// 회원번호 체크
	const mNumRegex = /[\-\s]/

	if (mNumRegex.test(modifying.m_number.value)) {
		alert('회원번호는 하이픈(-)이나 띄어쓰기 없이 입력해야 합니다.')
		modifying.m_number.focus()
		return false
	}

	// 회원인증번호 체크
	const vNumRegex = /^\d{4}$/

	if (modifying.v_number.value !== '' && !vNumRegex.test(modifying.v_number.value)) {
		alert('회원인증번호는 숫자 4자리로 입력해야 합니다.')
		return false
	}

	$("#modifying").submit();
//	return true
}