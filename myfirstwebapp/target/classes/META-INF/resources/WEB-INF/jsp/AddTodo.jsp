<%@include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="flex justify-center items-center min-h-screen bg-gray-700">
	<div class="bg-gray-800 p-8 rounded-xl shadow-lg w-96">
		<form:form method="POST" action="/add-todo" modelAttribute="todo"
			class="grid gap-3">
			<form:input path="description"
				class="bg-gray-200 p-2 rounded-lg text-center"
				placeholder="Enter Description" required="required" />
			<form:input path="targetDate"
				class="bg-gray-200 p-2 rounded-lg text-center" required="required" />
			<form:errors path="description" cssClass="text-red-500 text-sm" />
			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<button type="submit"
				class="bg-green-600 hover:bg-cyan-600 text-white font-semibold p-2 rounded-lg">Submit
				New Todo</button>
		</form:form>
	</div>
</div>

</body>
<%@include file="common/footer.jspf"%>
<script type="text/javascript">
  $(#targetDate).datepicker({
	  format: 'yyyy-mm-dd'
  });
  </script>