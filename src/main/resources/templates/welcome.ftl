<#import "parts/common.ftl" as c>
<@c.page>
<h5>Hello guest</h5>
<div>
    <span>
        This is simple clone twitters, for learning working with Spring Boot.
    </span>
    <div class="card-columns">
        <#list posts as post>
        <div class="card">
            <div class="card-body">
                <h5 class="card-title">${post.head}</h5>
                <p class="card-text">${post.body}</p>
            </div>
        </div>
    </#list>
    </div>

</div>
</@c.page>