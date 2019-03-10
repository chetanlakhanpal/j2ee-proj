<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="/templates/header.jsp">
	<jsp:param value="title" name="Home" />
</jsp:include>

<body>
	 <main role="main">

      <div class="album py-5">
        <div class="container">
          <h4 class="text-center mb-5">Your Profile</h4>
          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <div class="card-body">
                  <p class="card-text">Place: </p>
                  <p class="card-text">Contact Person: </p>
                  
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                    <small class="text-muted">9 mins</small>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

    </main>

	<jsp:include page="/templates/footer.jsp"></jsp:include>

</body>
</html>