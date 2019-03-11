<jsp:include page="/templates/header.jsp"></jsp:include>

</head>
<body>
  <div class="container pt-5">
    <div class="row">
      <div class="col-12">
        <div class="alert alert-danger" role="alert">
          A simple danger alert—check it out!
        </div>

        <form class="form-signin" action="" method="POST">
          
          <div class="form-label-group">
            <label for="inputEmail">Email address</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="email" required autofocus>
          </div>

			<div class="form-label-group">
	            <label for="inputPassword">Password</label>
	            <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
	          </div>
			
			<div class="form-label-group">
	           <label for="inputContact">Contact Number</label>
	            <input type="text" id="inputContact" class="form-control" maxlength="10" placeholder="Contact No." name="contact_no" required>
	        </div>

			<div class="form-label-group">
	            <label for="inputDob">Date Of Birth</label>
	            <input type="date" id="inputDob" class="form-control" placeholder="Date of Birth" name="dob" required>
	          </div>
			
			<div class="form-label-group">
	           <label for="bloodGroup">Blood Group</label>
	            <select class="custom-select d-block w-100 mb-3" id="bloodGroup" required>
                  <option value="">Choose...</option>
                  <option value="A+">A+</option>
                  <option value="A-">A-</option>
                  <option value="B+">B+</option>
                  <option value="B-">B+</option>
                  <option value="AB+">AB+</option>
                  <option value="AB-">AB-</option>
                  <option value="O+">O+</option>
                  <option value="O-">O-</option>

                </select>
	        </div>

          <button type="submit" class="btn btn-outline-primary">Submit</button>

        </form>
      </div>

    </div>
  </div>


</body>