<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container">
	<div class="row">

		<div class="box">
			<div id="tabs">
				<ul>
					<li><a href="#tabs-1">Rating</a></li>
					<li><a href="#tabs-2">Description</a></li>
					<div id="course-title" style="width: 100%">
						${course.name}
						<div>

							<a class="btn btn-info" role="button"
								href="<spring:url value="/courses/${course.id}/rating.html" />">Rate Course</a> <a
								class="btn btn-info" role="button"
								href="<spring:url value="/rating.html#tabs-2" />">Comment Course</a>
						</div>
					</div>
				</ul>
				<div id="tabs-1">
					<div class="row">
						<c:forEach items="${course.comments}" var="comment">
							<div class="box">
								<div class="col-lg-1">
									<div class="col-tiles">
										<div class="upvote">
											<a class="upvote"></a> <span class="count">5</span> <a
												class="downvote"></a>
										</div>
									</div>
								</div>
								<div class="col-lg-11">
									<div id="callout-navs-tabs-plugin"
										class="bs-callout bs-callout-info">

										<h5>
											<a href="#">${comment.title}</a>
										</h5>
									</div>
									${comment.content}
									<div class="collapse" id="collapseExample">
										<div class="well">used in this template are nested
											inbetween a normal Bootstrap row and the start of your column
											layout. The boxes will be full-width boxes, so if you want to
											make them smaller then you will need to customize.</div>
									</div>
									<button class="btn btn-primary" type="button"
										data-toggle="collapse" data-target="#collapseExample"
										aria-expanded="false" aria-controls="collapseExample">
										Read more</button>
								</div>
							</div>
						</c:forEach>



					</div>
				</div>

				<div id="tabs-2">
					<p>CAMPUS Course Description</p>
					<p>Description</p>
					<p>In this lecture of theoretical computer science, we extend
						concepts and results of the undergraduate course on automata
						theory. These results can be used for information processing and
						system construction/analysis.</p>

					<p>The following topics are covered in the course:</p>

					<p>simulation, bisimulation and efficient minimization of
						automata</p>
					<p>algorithmic learning in the context of automata theory</p>
					weighted automata and probabilistic automata
					<p>automata and (second order)logics</p>
					<p>pushdown systems</p>
					<p>undecidable problems in automata theory petri nets
					<p>Most of the topics are covered in the script "Applied
						Automata Theory". Additional Information</p>
					SWS: 3 ECTS Credits: 6 Language: English Links:
					<p>Prerequisites Die Pflichtveranstaltungen aus dem Bereich
						Theoretische Informatik. Literature</p>
					<p>W. Thomas, Applied Automata Theory, RWTH Aachen, 2004 J.
						Berstel, Transductions and Context-Free Languages, Teubner, 1979
						A. Paz, Introduction to Probabilistic Automata, Aca. Press,1971 H.
						Straubing, Finite Automata, Formal Logic, and Circuit Complexity,
						Birkhäuser, 1994</p>

				</div>
			</div>
		</div>


	</div>
</div>