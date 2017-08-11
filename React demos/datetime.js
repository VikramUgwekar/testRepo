function myFunction() {
    var d = new Date();
    var n = d.getTime();
	var minus = 30*6000;
	var out = n-minus;
    document.getElementById("demo").innerHTML = n;
	document.getElementById("demo2").innerHTML = out;
	
	var data ={
  "start": {
    "from": out,
    "to": n
  }
};

	var oAuthHeader = 'OAuth oauth_version="1.0"' +
            ', oauth_signature_method="HMAC-SHA1"' +
			', oauth_nonce="yDTGzwV19Q6pB7D"'+
            ', oauth_timestamp="' + n + '"' +
            ', oauth_consumer_key="7c9a8bb28ed04733a18aee522428ff92"' +
			', oauth_token="10dca0f6eeb34dbf9b6f697ead027561"' +
            ', oauth_signature="VWZrHkCOqzUA3YBIp4b7WFFpT7Y%3D"';
	
	$.ajax({
	        url: 'https://va.msghist.liveperson.net/messaging_history/api/account/72772122/conversations/search?limit=5&offset=0',
	        dataType : "jsonp",
            headers: { "Content-Type":"application/json","Accept": "application/json","Authorization": oAuthHeader },
            type: "POST",
            crossDomain: true,
            data: inpStrz
            success: function(data) {
			console.log(data);
			},
			 error: function () {
                    alert("Network error");
                }
				});
}
myFunction();
