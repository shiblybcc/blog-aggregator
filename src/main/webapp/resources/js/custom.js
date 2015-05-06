	$(function() {
		$("#tabs").tabs();
	});
//http://www.toolitup.com/jRate.html
$(function () {
			var that = this;
			$("#jRate").jRate({
				rating: 1,
				strokeColor: 'black',
				backgroundColor: '#DBDBDB',
				width: 25,
				height: 25,
				precision: 0.1,
				minSelected: 1,
				onChange: function(rating) {
					$('#demo-onchange-value').text("Your Rating: "+rating);;
				},
				onSet: function(rating) {
					console.log("save data to server database");
				}
			});
			
		});

$(function () {
	var that = this;
	$("#jRate2").jRate({
		rating: 1,
		strokeColor: 'black',
		backgroundColor: '#DBDBDB',
		width: 25,
		height: 25,
		precision: 0.1,
		minSelected: 1,
		onChange: function(rating) {
			$('#demo-onchange-value2').text("Your Rating: "+rating);;
		},
		onSet: function(rating) {
			console.log("save data to server database");
		}
	});
	
});

$(function () {
	var that = this;
	$("#jRate3").jRate({
		rating: 1,
		strokeColor: 'black',
		backgroundColor: '#DBDBDB',
		width: 25,
		height: 25,
		precision: 0.1,
		minSelected: 1,
		onChange: function(rating) {
			$('#demo-onchange-value3').text("Your Rating: "+rating);;
		},
		onSet: function(rating) {
			console.log("save data to server database");
		}
	});
	
});

$(function () {
	var that = this;
	$("#jRate4").jRate({
		rating: 1,
		strokeColor: 'black',
		backgroundColor: '#DBDBDB',
		width: 25,
		height: 25,
		precision: 0.1,
		minSelected: 1,
		onChange: function(rating) {
			$('#demo-onchange-value4').text("Your Rating: "+rating);;
		},
		onSet: function(rating) {
			console.log("save data to server database");
		}
	});
	
});

$(function () {
	var that = this;
	$("#jRate5").jRate({
		rating: 1,
		strokeColor: 'black',
		backgroundColor: '#DBDBDB',
		width: 25,
		height: 25,
		precision: 0.1,
		minSelected: 1,
		onChange: function(rating) {
			$('#demo-onchange-value5').text("Your Rating: "+rating);;
		},
		onSet: function(rating) {
			console.log("save data to server database");
		}
	});
	
});