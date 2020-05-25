// TODO: 이 script 및 연결된 html에는 hard coding 요소가 많음
// 상품별 class 처리 -> 인스턴스 배열 -> select / order table 출력 방식으로 변경하는 것이 바람직함
// (차후 html을 템플릿(ejs, jsp)으로 변경 시 수정 적용할 것)

// 상품 가격
const price_1a = 6600
const price_1b = 27500
const price_1c = 38500
const price_1d = 60500
const price_1e = 71500

const price_2a = 6600
const price_2b = 27500
const price_2c = 38500
const price_2d = 60500
const price_2e = 71500

const price_3a = 27500
const price_3b = 38500
const price_3c = 71500

const price_4a = 8800
const price_4b = 3300
const price_4c = 2200

// 상품 선택란에 가격 출력
$('#price-1-1').html(price_1a.toLocaleString())
$('#price-1-2').html(price_1b.toLocaleString())
$('#price-1-3').html(price_1c.toLocaleString())
$('#price-1-4').html(price_1d.toLocaleString())
$('#price-1-5').html(price_1e.toLocaleString())

$('#price-2-1').html(price_2a.toLocaleString())
$('#price-2-2').html(price_2b.toLocaleString())
$('#price-2-3').html(price_2c.toLocaleString())
$('#price-2-4').html(price_2d.toLocaleString())
$('#price-2-5').html(price_2e.toLocaleString())

$('#price-3-1').html(price_3a.toLocaleString())
$('#price-3-2').html(price_3b.toLocaleString())
$('#price-3-3').html(price_3c.toLocaleString())

// 날짜 입력 처리
$.datepicker.setDefaults({
  dateFormat: 'yy-mm-dd',
  prevText: '이전 달',
  nextText: '다음 달',
  monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
  monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
  dayNames: ['일', '월', '화', '수', '목', '금', '토'],
  dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
  dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
  showMonthAfterYear: true,
  yearSuffix: '년'
})

$('#receiveDate').datepicker()
$('#returnDate').datepicker()  

// select 태그에 들어갈 option 태그를 만든다
const makeOption = num => {
  let options = '<option value="0">선택</option>'
  for (let i = 0; i < num; i++) {
    options += `<option value="${i + 1}">${i + 1}개</option>`
  }

  return options
}

// 주문 내역 테이블 출력
const makeOrderTable = () => {
  $('#input-return-date').css('visibility', 'hidden')

  // 수령, 반납장소 선택 확인
  if ($('#receivePlace option:selected').val() == 0 || $('#returnPlace option:selected').val() == 0) {
    alert('수령, 반납 장소를 선택해주세요.')
    $("input[type=checkbox]").prop("checked", false)
  }

  let orderTable = ''

  // Table Header
  if ($("input:checkbox[name=select-box]:checked").length !== 0) orderTable = `
    <table id="orderBox">
      <colgroup>
        <col width="245px">
        <col width="110px">
        <col width="110px">
        <col width="65px">
        <col width="90px">
        <col width="50px">
      </colgroup>
      <tr class="header">
        <th>상품</th>
        <th>이용요금</th>
        <th>임대기간요금</th>
        <th>수량</th>
        <th>합계</th>
        <th>삭제</th>
      </tr>`

  // Prepaid Data SIM
  if ($('#select-1-1').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid Data SIM 1일(24시간)</b><br>본 상품은 <span class="red">1</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_1a.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-1-1" id="num-1-1" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-1a" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-1-1')"></button>
        </td>
      </tr>`
  }

  if ($('#select-1-2').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Data SIM 5일(120시간)</b><br>본 상품은 <span class="red">5</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_1b.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-1-2" id="num-1-2" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-1b" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-1-2')"></button>
        </td>
      </tr>`
  }
  
  if ($('#select-1-3').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid Data SIM 10일(240시간)</b><br>본 상품은 <span class="red">10</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_1c.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-1-3" id="num-1-3" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-1c" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-1-3')"></button>
        </td>
      </tr>`
  }
  
  if ($('#select-1-4').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid Data SIM 20일(480시간)</b><br>본 상품은 <span class="red">20</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_1d.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-1-4" id="num-1-4" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-1d" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-1-4')"></button>
        </td>
      </tr>`
  }

  if ($('#select-1-5').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid Data SIM 30일(720시간)</b><br>본 상품은 <span class="red">1</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_1e.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-1-5" id="num-1-5" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-1e" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-1-5')"></button>
        </td>
      </tr>`
  }

  // Prepaid SIM
  if ($('#select-2-1').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid SIM 1일(24시간)</b><br>본 상품은 <span class="red">1</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_2a.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-2-1" id="num-2-1" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-2a" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-2-1')"></button>
        </td>
      </tr>`
  }

  if ($('#select-2-2').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid SIM 5일(120시간)</b><br>본 상품은 <span class="red">5</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_2b.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-2-2" id="num-2-2" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-2b" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-2-2')"></button>
        </td>
      </tr>`
  }
  
  if ($('#select-2-3').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid SIM 10일(240시간)</b><br>본 상품은 <span class="red">10</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_2c.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-2-3" id="num-2-3" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-2c" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-2-3')"></button>
        </td>
      </tr>`
  }

  if ($('#select-2-4').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid SIM 20일(480시간)</b><br>본 상품은 <span class="red">20</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_2d.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-2-4" id="num-2-4" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-2d" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-2-4')"></button>
        </td>
      </tr>`
  }

  if ($('#select-2-5').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Prepaid SIM 30일(720시간)</b><br>본 상품은 <span class="red">30</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_2e.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-2-5" id="num-2-5" class="num-select">
            ${makeOption(3)}
          </select>
        </td>
        <td id="amount-2e" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-2-5')"></button>
        </td>
      </tr>`
  }

  // Postpaid SIM
  if ($('#select-3-1').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Postpaid SIM (5일권)</b><br>본 상품은 <span class="red">5</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_3a.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-3-1" id="num-3-1" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-3a" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-3-1')"></button>
        </td>
      </tr>`

      $('#input-return-date').css('visibility', 'visible')
  }

  if ($('#select-3-2').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Postpaid SIM (10일권)</b><br>본 상품은 <span class="red">10</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_3b.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-3-2" id="num-3-2" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-3b" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-3-2')"></button>
        </td>
      </tr>`

      $('#input-return-date').css('visibility', 'visible')
  }

  if ($('#select-3-3').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>Postpaid SIM (30일권)</b><br>본 상품은 <span class="red">30</span>일 동안 이용 가능합니다.</td>
        <td class="price">${price_3c.toLocaleString()} 원 / 1개</td>
        <td class="none-period">-</td>
        <td>
          <select name="num-3-3" id="num-3-3" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-3c" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-3-3')"></button>
        </td>
      </tr>`

    $('#input-return-date').css('visibility', 'visible')
  }

  // 기타상품
  if ($('#select-4-1').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>WiFi Router</b></td>
        <td class="price">${price_4a.toLocaleString()} 원 / 1일</td>
        <td id="day-price-4-1" class="day-price">0원 / <span class="red">0</span>일</td>
        <td>
          <select name="num-4-1" id="num-4-1" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-4a" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-4-1')"></button>
        </td>
      </tr>`

    $('#input-return-date').css('visibility', 'visible')
  }

  if ($('#select-4-2').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>휴대폰</b></td>
        <td class="price">${price_4b.toLocaleString()} 원 / 1일</td>
        <td id="day-price-4-2" class="day-price">0원 / <span class="red">0</span>일</td>
        <td>
          <select name="num-4-2" id="num-4-2" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-4b" class="product-amount">0원</td>
        <td>
          <button type="button" class="close-button" onclick="del('#select-4-2')"></button>
        </td>
      </tr>`
    
    $('#input-return-date').css('visibility', 'visible')
  }

  if ($('#select-4-3').prop('checked')) {
    orderTable += `
      <tr>
        <td><b>보조배터리</b></td>
        <td class="price">${price_4c.toLocaleString()} 원 / 1일</td>
        <td id="day-price-4-3" class="day-price"">0원 / <span class="red">0</span>일</td>
        <td>
          <select name="num-4-3" id="num-4-3" class="num-select">
            ${makeOption(50)}
          </select>
        </td>
        <td id="amount-4c" class="product-amount">0원</td>
        <td>
          <button type="button" id="close-4-3" class="close-button" onclick="del('#select-4-3')"></button>
        </td>
      </tr>`

    $('#input-return-date').css('visibility', 'visible')
  }

  // Table Footer
  if ($("input:checkbox[name=select-box]:checked").length !== 0) {
    orderTable += `
        <tr class="order-amount-1">
          <td>이용요금합계</td>
          <td colspan="5"><span id="order-amount-1" class="float-right">0원</span></td>
        </tr>
        <tr class="order-amount-2">
          <td>할인금액</td>
          <td colspan="5">
            <span class="red">&emsp;* 온라인 예약 할인</span>
            <span id="order-amount-2" class="float-right"><span class="red">- 0</span>원</span>
          </td>
        </tr>
        <tr class="order-amount-3">
          <td>이용요금총액<br><span class="red">* 원화(KRW)로 결제되며 결제 시점의 환율이 적용됩니다.</span></td>
          <td colspan="5"><span id="order-amount-3" class="float-right">0원</span></td>
        </tr>
      </table>`
  }

  $('#orderArea').html(orderTable)

  // 수량 변화 시 이벤트 핸들러
  $('.num-select').change(() => {
    // 상품 별 총액 변수
    let amount_1a = 0
    let amount_1b = 0
    let amount_1c = 0
    let amount_1d = 0
    let amount_1e = 0

    let amount_2a = 0
    let amount_2b = 0
    let amount_2c = 0
    let amount_2d = 0
    let amount_2e = 0

    let amount_3a = 0
    let amount_3b = 0
    let amount_3c = 0

    let amount_4a = 0
    let amount_4b = 0
    let amount_4c = 0

    // 상품 별 지정된 수량에 따른 총액 계산
    let dayAlert = false
    let dayDiffAlert = false
    let days = -1

    if (!isNaN(price_3a * $('#num-3-1 option:selected').val())) {
      days = dayDiff()
      dayDiffAlert = true

      if (days == -1) $('#num-3-1').val(0)
      else amount_3a = price_3a * $('#num-3-1 option:selected').val()
    }

    if (!isNaN(price_3b * $('#num-3-2 option:selected').val())) {
      if (dayDiffAlert === false) {
        days = dayDiff()
        dayDiffAlert = true
      }

      if (days == -1) $('#num-3-2').val(0)
      else amount_3b = price_3b * $('#num-3-2 option:selected').val()
    }

    if (!isNaN(price_3c * $('#num-3-3 option:selected').val())) {
      if (dayDiffAlert === false) {
        days = dayDiff()
        dayDiffAlert = true
      }

      if (days == -1) $('#num-3-3').val(0)
      else amount_3c = price_3c * $('#num-3-3 option:selected').val()
    }

    if (!isNaN(price_4a * $('#num-4-1 option:selected').val())) {
      if (dayDiffAlert === false) {
        days = dayDiff()
        dayDiffAlert = true
      }

      if (days == -1) $('#num-4-1').val(0)
      else {
        amount_4a = days * price_4a * $('#num-4-1 option:selected').val()
        $('#day-price-4-1').html(`${(price_4a * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
      }
    }

    if (!isNaN(price_4b * $('#num-4-2 option:selected').val())) {
      if (dayDiffAlert === false) {
        days = dayDiff()
        dayDiffAlert = true
      }

      if (days == -1) $('#num-4-2').val(0)
      else {
        amount_4b = days * price_4b * $('#num-4-2 option:selected').val()
        $('#day-price-4-2').html(`${(price_4b * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
      }
    }

    if (!isNaN(price_4c * $('#num-4-3 option:selected').val())) {
      if (dayDiffAlert === false) {
        days = dayDiff()
        dayDiffAlert = true
      }

      if (days == -1) $('#num-4-3').val(0)
      else {
        amount_4c = days * price_4c * $('#num-4-3 option:selected').val()
        $('#day-price-4-3').html(`${(price_4c * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
      }
    }

    if (!isNaN(price_1a * $('#num-1-1 option:selected').val())) {
      if ($('#receiveDate').val() === '' && dayDiffAlert === false) {
        alert('임대일을 먼저 선택해주세요')
        dayAlert = true
        $('#num-1-1').val(0)
      } else amount_1a = price_1a * $('#num-1-1 option:selected').val()
    }

    if (!isNaN(price_1b * $('#num-1-2 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-1-2').val(0)
      } else amount_1b = price_1b * $('#num-1-2 option:selected').val()
    }

    if (!isNaN(price_1c * $('#num-1-3 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-1-3').val(0)
      } else amount_1c = price_1c * $('#num-1-3 option:selected').val()
    }

    if (!isNaN(price_1d * $('#num-1-4 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-1-4').val(0)
      } else amount_1d = price_1d * $('#num-1-4 option:selected').val()
    }

    if (!isNaN(price_1e * $('#num-1-5 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-1-5').val(0)
      } else amount_1e = price_1e * $('#num-1-5 option:selected').val()
    }

    if (!isNaN(price_2a * $('#num-2-1 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-2-1').val(0)
      } else amount_2a = price_2a * $('#num-2-1 option:selected').val()
    }

    if (!isNaN(price_2b * $('#num-2-2 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-2-2').val(0)
      } else amount_2b = price_2b * $('#num-2-2 option:selected').val()
    }

    if (!isNaN(price_2c * $('#num-2-3 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-2-3').val(0)
      } else amount_2c = price_2c * $('#num-2-3 option:selected').val()
    }

    if (!isNaN(price_2d * $('#num-2-4 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-2-4').val(0)
      } else amount_2d = price_2d * $('#num-2-4 option:selected').val()
    }

    if (!isNaN(price_2e * $('#num-2-5 option:selected').val())) {
      if ($('#receiveDate').val() === '') {
        if (dayAlert === false && dayDiffAlert === false) {
          alert('임대일을 먼저 선택해주세요')
          dayAlert = true
        }
        $('#num-2-5').val(0)
      } else amount_2e = price_2e * $('#num-2-5 option:selected').val()
    }

    const totalAmount = amount_1a + amount_1b + amount_1c + amount_1d + amount_1e + amount_2a + amount_2b + amount_2c + amount_2d + amount_2e + amount_3a + amount_3b + amount_3c + amount_4a + amount_4b + amount_4c
    const discountAmount = (amount_1b + amount_1c + amount_1d + amount_1e + amount_2b + amount_2c + amount_2d + amount_2e + amount_3a + amount_3b + amount_3c) / 10 + (amount_4a + amount_4b + amount_4c) / 2
    const finalAmount = totalAmount - discountAmount

    // 계산된 총액 삽입
    $('#amount-1a').html(amount_1a.toLocaleString() + '원')
    $('#amount-1b').html(amount_1b.toLocaleString() + '원')
    $('#amount-1c').html(amount_1c.toLocaleString() + '원')
    $('#amount-1d').html(amount_1d.toLocaleString() + '원')
    $('#amount-1e').html(amount_1e.toLocaleString() + '원')

    $('#amount-2a').html(amount_2a.toLocaleString() + '원')
    $('#amount-2b').html(amount_2b.toLocaleString() + '원')
    $('#amount-2c').html(amount_2c.toLocaleString() + '원')
    $('#amount-2d').html(amount_2d.toLocaleString() + '원')
    $('#amount-2e').html(amount_2e.toLocaleString() + '원')

    $('#amount-3a').html(amount_3a.toLocaleString() + '원')
    $('#amount-3b').html(amount_3b.toLocaleString() + '원')
    $('#amount-3c').html(amount_3c.toLocaleString() + '원')

    $('#amount-4a').html(amount_4a.toLocaleString() + '원')
    $('#amount-4b').html(amount_4b.toLocaleString() + '원')
    $('#amount-4c').html(amount_4c.toLocaleString() + '원')

    $('#order-amount-1').html(totalAmount.toLocaleString() + '원')
    $('#order-amount-2').html(`<span class="red">- ${discountAmount.toLocaleString()}</span>원`)
    $('#order-amount-3').html(finalAmount.toLocaleString() + '원')
  })
}

// 셀렉트 박스 변동 시 이벤트 핸들러
$('input[name=select-box]').change(makeOrderTable)

// 삭제버튼 클릭 처리
function del (target) {
  if (target === '#select-3-1' || target === '#select-3-2' || target === '#select-3-3' || target === '#select-4-1' || target === '#select-4-2' || target === '#select-4-3') {
    $('#input-return-date').css('visibility', 'hidden')
    $('#returnDate').val('')
  }

  $(target).prop('checked', false)
  makeOrderTable()
}

// 날짜 입력 시 이벤트 핸들러
$('.date').change(checkDate)

// 임대일, 반납일 체크
function checkDate () {
  const startDate = new Date($('#receiveDate').val())
  const endDate = new Date($('#returnDate').val())
  const today = new Date()
  
  let msDiff = startDate.getTime() - today.getTime()
  const checkStartDate = msDiff / (1000 * 60 * 60 * 24)
  
  msDiff = endDate.getTime() - today.getTime()
  const checkEndDate = msDiff / (1000 * 60 * 60 * 24)

  if (startDate === today || checkStartDate < 0) {
    alert('임대, 반납일은 예약일(금일) 다음날부터 지정 가능합니다.')
    $('#receiveDate').val('')
  }

  if (endDate === today || checkEndDate < 0) {
    alert('임대, 반납일은 예약일(금일) 다음날부터 지정 가능합니다.')
    $('#returnDate').val('')
  }

  if (startDate !== today && checkStartDate > 0 && endDate !== today && checkEndDate > 0) {
    const days = dayDiff()
    $('#day-price-4-1').html(`${(price_4a * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
    $('#day-price-4-2').html(`${(price_4b * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
    $('#day-price-4-3').html(`${(price_4c * days).toLocaleString()}원 / <span class="red">${days}</span>일`)
  }
}

// 임대일, 반납일 차이 계산
function dayDiff () {
  if ($('#receiveDate').val() === '' || $('#returnDate').val() === '') {
    alert('임대, 반납일을 먼저 선택해주세요')
    return -1
  }

  const startDate = new Date($('#receiveDate').val())
  const endDate = new Date($('#returnDate').val())
  
  const msDiff = endDate.getTime() - startDate.getTime()
  const daysDiff = msDiff / (1000 * 60 * 60 * 24)
  
  return daysDiff + 1
}
