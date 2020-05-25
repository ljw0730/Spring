	
	var count = 0;
	
	$("#bottom_table tr").hide();
	
	$("#one_day").click(function() {
		if($(this).is(":checked")) {
			if(count == 0) {
				$("#table_title").show();
			}
			$("#dsim_one_day").show();
			count++;
		}
		else {
			if(count == 1) {
				$("#table_title").hide();
			}
			$("#dsim_one_day").hide();
			count--;
		}
	});
	
	$("#five_day").click(function() {
		if($(this).is(":checked")) {
			if(count == 0) {
				$("#table_title").show();
			}
			$("#dsim_five_day").show();
			count++;
		}
		else {
			if(count == 1) {
				$("#table_title").hide();
			}
			$("#dsim_five_day").hide();
			count--;
		}
	});
	
	$("#ten_day").click(function() {
		if($(this).is(":checked")) {
			if(count == 0) {
				$("#table_title").show();
			}
			$("#dsim_ten_day").show();
			count++;
		}
		else {
			if(count == 1) {
				$("#table_title").hide();
			}
			$("#dsim_ten_day").hide();
			count--;
		}
	});
	
	$("#twenty_day").click(function() {
		if($(this).is(":checked")) {
			if(count == 0) {
				$("#table_title").show();
			}
			$("#dsim_twenty_day").show();
			count++;
		}
		else {
			if(count == 1) {
				$("#table_title").hide();
			}
			$("#dsim_twenty_day").hide();
			count--;
		}
	});
	
	$("#thirty_day").click(function() {
		if($(this).is(":checked")) {
			if(count == 0) {
				$("#table_title").show();
			}
			$("#dsim_thirty_day").show();
			count++;
		}
		else {
			if(count == 1) {
				$("#table_title").hide();
			}
			$("#dsim_thirty_day").hide();
			count--;
		}
	});
	
	
	
	// textarea 글자 수 카운팅
	var memo;
	var memo_count = 0;
	var max = 50;
	$("#memo").keyup(function() {
		memo = $(this).val();
		memo_count = memo.length;
		$("#count").text(memo_count);
		
		if(memo_count > max) {
			alert("글자 입력수를 초과하였습니다.");
			$(this).val(memo.substr(0, max));
			$("#count").text(max);
		}
	});