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
		<div class="alert alert-success" role="alert">
		  A simple success alert—check it out!
		</div>
		<div class="alert alert-danger" role="alert">
		  A simple danger alert—check it out!
		</div>
		
	<form class="form-signin" action="/register" method="POST">
		<div class="form-label-group">
			<input type="email" id="inputEmail" class="form-control"
				placeholder="Email address" required autofocus> <label
				for="inputEmail">Email address</label>
		</div>

		<div class="form-label-group">
			<input type="password" id="inputPassword" class="form-control"
				placeholder="Password" required> <label for="inputPassword">Password</label>
		</div>
		<div class="form-label-group">
			<input type="password" id="confirm-inputPassword" class="form-control"
				placeholder="Confirm Password" required> <label for="inputPassword">Confirm Password</label>
		</div>
		<div class="form-label-group">
			<input type="text" id="name" class="form-control"
				placeholder="Name" required> <label for="name">Full Name</label>
		</div>
		<div class="form-label-group">
			<input type="password" id="confirm-inputPassword" class="form-control"
				placeholder="Confirm Password" required> <label for="inputPassword">Confirm Password</label>
		</div>
		<div class="form-label-group">
			<input type="date" id="dob" class="form-control" required>
			<label for="dob">Date of Birth</label>
		</div>
		<div class="form-label-group">
			<input type="tel" id="contact_no" class="form-control" required>
			<label for="contact_no">Contact No.</label>
		</div>
		
		<div class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="type" id="type-donor" value="donor">
		  <label class="form-check-label" for="type-donor">Donor</label>
		</div>
		
		<div class="form-check form-check-inline">
		  <input class="form-check-input" type="radio" name="type" id="type-recipient" value="receipient">
		  <label class="form-check-label" for="type-recipient">Recipient</label>
		</div>
		
		<button type="button" class="btn btn-outline-primary">Submit</button>
		
	</form>
</body>