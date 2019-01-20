<jsp:include page="/templates/header.jsp">
	<jsp:param value="title" name="Home" />
</jsp:include>

<body>
	 <main role="main">

      <section class="jumbotron text-center">
        <div class="container">
          <h1 class="jumbotron-heading">Donate Blood, Save Life!</h1>
          <p class="lead text-muted">Help someone live longer, by making a small contribution</p>
          <p>
            <a href="#" class="btn btn-primary my-2">Explore camps !</a>
            <a href="/register" class="btn btn-secondary my-2">Register as a Donor</a>
          </p>
        </div>
      </section>

      <div class="album py-5 bg-light">
        <div class="container">
          <h4 class="text-center mb-5">Newly added Camps</h4>
          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <div class="card-body">
                  <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                      <button type="button" class="btn btn-sm btn-outline-secondary">Edit</button>
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