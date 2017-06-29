var i=[];
function doAjaxPost() {
	alert("calling");
//	get the form values
	var employeeid = $('#employeeid').val();
	$.ajax({
		type: "POST",
		url: "/DemoClass/users",
		data: "employeeid=" + employeeid,
		success: function(response){
			// we have the response
			if(response.status == "SUCCESS"){
				userInfo = "<table>";

				userInfo += "<tr><th>EmployeeId</th><th>Name</th><th>Designation</th></tr><tr><td>" + response.result.empid +"</td><td>"
				+ response.result.empname+"</td><td>"+response.result.empdesignation+"</td></tr>";

				userInfo += "</table>";
				alert('userInfo ' + userInfo);
				$('#info').html("User Details are as follows" +userInfo);
				$('#EmployeeId').val('');
				$('#error').hide('slow');
				$('#info').show('slow');
			}else{
				errorInfo = "";
				for(i=0 ; i < response.result.length ; i++){
					errorInfo += "<br>" + (i + 1) +". " + response.result[i].defaultMessage;
				}
				alert('errors' + errorInfo);
				$('#error').html("Please correct following errors: " +errorInfo);
				$('#info').hide('slow');
				$('#error').show('slow');
			}
		},
		error: function(e){
			alert('Error: ' + e);
		}
	});
}