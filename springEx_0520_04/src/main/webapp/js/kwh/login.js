const formCheck = () => {
  // 비밀번호 체크
  const pwRegex1 = /[A-Za-z]/
  const pwRegex2 = /\d/
  const pwRegex3 = /[!@#\$%\^&\*\(\)\-=`~\[\]\\\{\}\|;':",\./<>\?_]/
  let pwTypeNum = 0;

  if (pwRegex1.test(login.pw.value)) pwTypeNum++
  if (pwRegex2.test(login.pw.value)) pwTypeNum++
  if (pwRegex3.test(login.pw.value)) pwTypeNum++

  if (pwTypeNum < 2) {
    alert('비밀번호에는 영문, 숫자, 특수문자 중 적어도 2종류 이상이 포함되어야 합니다.')
    agree.pw1.focus()
    return false
  }

  return true
}