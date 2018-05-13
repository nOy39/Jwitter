<#import "parts/common.ftl" as c>

<@c.page>
<h3>Input post</h3>
<div>
    <form method="post">
        <input type="text" name="head" placeholder="Заголовок">

        <textarea rows="20" cols="120" name="body">Enter text here...</textarea>
        <!--<input type="text" name="body" placeholder="body">-->
        <input type="text" name="tag" placeholder="tag">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="submit">

</form>
</div>
</@c.page>