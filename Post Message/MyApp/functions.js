window.onload = function() {
	// Get the window displayed in the iframe.
	var win = window.open();
    win.document.write('<iframe id="receiver" src="http://localhost:8080/receiver/receiver.html" width="500" height="200"><p>Your browser does not support iframes.</p></iframe>');
	var receiver = win.document.getElementById('receiver').contentWindow;
  
	// Get a reference to the 'Send Message' button.
	var btn = document.getElementById('send');
//var message = document.getElementById('in').value;
	// A function to handle sending messages.
	function sendMessage(e) {
		// Prevent any default browser behaviour.
		e.preventDefault();
var message = document.getElementById('in').value;
		// Send a message with the text 'Hello Treehouse!' to the new window.
		receiver.postMessage(message, 'http://localhost:8080/receiver/');
	}

	// Add an event listener that will execute the sendMessage() function
	// when the send button is clicked.
	btn.addEventListener('click', sendMessage);
}
