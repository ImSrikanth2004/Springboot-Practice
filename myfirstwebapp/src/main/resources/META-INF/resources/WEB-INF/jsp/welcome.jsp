<%@include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
  <body
    class="bg-gray-700 text-white flex flex-col items-center justify-top h-screen">
    
    <div class="text-3xl italic mb-4">Welcome ${name}!</div>
    <hr class="border-gray-500 w-1/2 mb-4" />
    <div class="text-lg">
      <a href="list-todos" class="text-cyan-900 underlined font-semibold">
        Manage your todos
      </a>
      
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
  </body>
<%@include file="common/footer.jspf"%>
