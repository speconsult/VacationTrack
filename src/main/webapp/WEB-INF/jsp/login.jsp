<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<s:layout-render name="/WEB-INF/jsp/template/vctemplate.jsp" pageTitle="Using A Layout">
    <s:layout-component name="content">

        <s:form beanclass="dk.speconsult.web.LoginActionBean">
            <table>
                <tbody>
                <tr>
                    <td>
                        <s:label for="user.userName"/>
                        <s:text name="user.userName"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <s:label for="user.password"/>
                        <s:password name="user.password"/>
                    </td>
                </tr>
                </tbody>
            </table>
            <s:submit name="login" value="OK" />
        </s:form>

    </s:layout-component>
</s:layout-render>
