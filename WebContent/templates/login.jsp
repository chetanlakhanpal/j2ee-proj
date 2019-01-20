
<jsp:include page="/templates/header.jsp"></jsp:include>
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>

</head>
<body>
		<div class="alert alert-danger" role="alert">
		  Invalid Credentials
		</div>
		
	<form class="form-signin" action="login" method="POST">
		<div class="form-label-group">
			<input type="email" id="inputEmail" class="form-control"
				placeholder="Email address" required autofocus> <label
				for="inputEmail">Email address</label>
		</div>

		<div class="form-label-group">
			<input type="password" id="inputPassword" class="form-control"
				placeholder="Password" required> <label for="inputPassword">Password</label>
		</div>
	</form>
</body>