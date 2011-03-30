package dk.speconsult.web.employee

import net.sourceforge.stripes.action.Resolution
import net.sourceforge.stripes.action.DefaultHandler
import dk.speconsult.web.BaseActionBean
import dk.speconsult.model.Employee

/**
 * Created by IntelliJ IDEA.
 * User: dev
 * Date: 26-03-11
 * Time: 22:01
 * To change this template use File | Settings | File Templates.
 */
class ProcessEmployeeBean extends BaseActionBean {

    Employee employee

    @DefaultHandler
    public Resolution showEmployee() {
        forward(EMPLOYEE_CREATE_JSP)
    }

    public Resolution editEmployee() {
        //employee.update()
        forward(EMPLOYEE_LIST_JSP)
    }

    public Resolution createEmployee() {
        employee.saveIt()
        redirect(dk.speconsult.web.employee.ListEmployeesActionBean.class)
    }

    public Resolution deleteEmployee() {
        employee.delete();
        forward(EMPLOYEE_LIST_JSP)
    }
}