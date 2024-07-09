/**
 * 
 */

function writeCheck() {
	
	if(document.writeForm.btitle.value.length == 0) {
		alert("입력해야함.");
		return false;
	}
	if(document.writeForm.bcontent.value.length == 0) {
			alert("입력해야함");
			return false;
	}
	
	document.writeForm.submit();
				
		
}