<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>





<div class="container">

	<div class="row">
		<div class="box">
			<ul class="nav nav-tabs presentation" style="margin-left: 20%;">
				<li role="presentation" class="active" style="font-size: 12px;"><a
					href="#" style="padding: 3px;">Overall Rating</a></li>
				<li role="presentation" style="font-size: 12px;"><a href="#"
					style="padding: 3px;">Professor Rating</a></li>
				<li role="presentation" style="font-size: 12px;"><a href="#"
					style="padding: 3px;">Exercise Rating</a></li>
				<li role="presentation" style="font-size: 12px;"><a href="#"
					style="padding: 3px;">Course Rating</a></li>
				<li role="presentation" style="font-size: 12px;"><a href="#"
					style="padding: 3px;">Lecture Rating</a></li>
			</ul>
		</div>
	</div>

	<c:forEach items="${courses}" var="course">


		<div class="row">
			<div class="box">
				<div class="col-lg-3">
					<div class="col-tiles">
						<h6>Rating</h6>
						<a class="btn btn-primary btn-lg" href="#" role="button">4.6</a>
					</div>
					<div class="col-tiles">
						<h6>Comment</h6>
						<a class="btn btn-primary btn-lg" href="#" role="button">17</a>
					</div>
				</div>
				<div class="col-lg-9">
					<div id="callout-navs-tabs-plugin"
						class="bs-callout bs-callout-info">


						<h5>
							<a href="<spring:url value="/courses/${course.id}.html" />">
								${course.name} </a>
						</h5>
					</div>

					${course.description}

				</div>
			</div>
		</div>
	</c:forEach>

</div>
<!-- /.container -->