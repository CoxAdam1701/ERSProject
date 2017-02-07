$(document).ready(function() {
	$(".form-group").hide()
	$("#newReimButton").click(function() {
		$(".form-group").show();
	});
	$("#cancelButton").click(function(){
		$(".form-group").hide();
	});
});
function submitReim(){
var s = JSON.stringify({"amount":$(amountInput).val(), "desc": $(Textarea), "type":$(reimType).val()}) ;

	$.ajax({
		url: "newReim",
		method:"POST",
		data: s,
		success: function(result,status,xhr){
			console.log("success");
			
		},
		error: function(xhr, status){
			console.log("error");
		},
		complete:function(xhr, status){
			console.log("complete");
		}
	})
}
document.getElementById("submitReimButton").addEventListener("click", submitReim, false);