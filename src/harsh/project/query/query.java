/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harsh.project.query;

public class query {
    public String insert_veichledata="insert into vehicledetail values(?,?,?,?,?,?,?,?);";
    public String search_vehicle="select*from vehicledetail where registrationnumber=?";
    public String delete_search="delete from vehicledetail where registrationnumber=?";
    public String insert_LicenceDetail="insert into LicenceDetail values(?,?,?,?,?,?,?,?,?,?,?)";
    public String search_LicenceDetail="select*from licencedetail where LicenceNumber=?";
    public String update_LicenceDetail="update licencedetail set PermanentAddress=?,IdentityMark=?,LicenceType=?,LicenceValidity=? where LicenceNumber=?";
    public String delete_licencedetail="delete from licencedetail where LicenceNumber=?";
    public String insert_publictransport="insert into public_transport values(?,?,?,?,?,?,?,?,?,?);";
    public String search_transport="select*from public_transport where source=? and destination=?";
    public String insert_login="insert into login values(?,?,?)";
    public String search_user="select*from login where id=?";
    public String search_id="select*from login where id=?";
    public String insert_ticket="insert into ticket value(?,?,?,?)";
    public String delete_ticket="truncate table ticket";
    public String select_ticket="select*from ticket";
    }
