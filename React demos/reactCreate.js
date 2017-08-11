<!DOCTYPE html>
<html>
<head>
<title>React</title>
<meta charset="UTF-8" />

    <script src="https://unpkg.com/react@latest/dist/react.js"></script>
    <script src="https://unpkg.com/react-dom@latest/dist/react-dom.js"></script>
    <script src="https://unpkg.com/babel-standalone@6.15.0/babel.min.js"></script>
	<link rel="stylesheet" type="text/css" href="D:\Code Base\Amex_GCE\css\chatWidgetFrame.css">
</head>

<body>

<div id = "root">
<script type="text/babel">
var chatWindow = React.createClass{
	render: function(){
		return React.createElement("div", {id: "lpChatWizFrameContainer"},
		React.createElement("div", {id: "lpChatFrameContainer"},
		React.createElement("div", {id: "lpChatTitleContainer", className:"lpRight"},
		React.createElement("div", {id: "lpChatTitleDragArea", className: "lpLeft"},
		React.createElement("div", {className: "lpLeft"}, React.createElement("span", {className: "lpChatTitleContainerLogo lpLeft lpCustSpriteBackground lpCustChatLogoSmall"})))))
		)
	}
	
	
}


ReactDOM.render(
  <chatWindow />,
  document.getElementById('root')
);
</script>
<h1>React Test</h1>
<div id="root"></div>
</body>

</html>