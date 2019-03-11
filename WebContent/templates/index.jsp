<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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
            <a href="./register" class="btn btn-secondary my-2">Register as a Donor</a>
          </p>
        </div>
      </section>

      <div class="album py-5 bg-light">
        <div class="container">
          <h4 class="text-center mb-5">Newly added Camps</h4>
          <div class="row">
          <c:forEach items="${requestScope.camps}" var="camp" varStatus="loop">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow">
                <div class="card-body">
                  <p class="card-text">City: ${camp.city}</p>
                  <p class="card-text">Date: ${camp.date}</p>
                  <p class="card-text">Place: ${camp.venue}</p>
                  <p class="card-text">Contact Mobile: ${camp.mobile_no}</p>
                  <p class="card-text">Contact Email: ${camp.email}</p>
                  
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                    <small class="text-muted">
                    <fmt:formatDate value="${date}" dateStyle="short"/></small>
                  </div>
                </div>
              </div>
            </div>
            </c:forEach>
            <c:if test="${fn:length(requestScope.camps) == 0}">
            	<p class="text-center">No newly added camps as of now.</p>
            </c:if>
          </div>
        </div>
      </div>
    </main>

	<jsp:include page="/templates/footer.jsp"></jsp:include>

</body>
</html>