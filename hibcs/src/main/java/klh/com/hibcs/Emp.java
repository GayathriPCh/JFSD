package klh.com.hibcs;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Emp {
 @Id
 private int eid;
 private String ename;
 
 @OneToOne
 private Dept d;
 
 public int getEid() {
  return eid;
 }
 public void setEid(int eid) {
  this.eid = eid;
 }
 public String getEname() {
  return ename;
 }
 public void setEname(String ename) {
  this.ename = ename;
 }
 public Dept getD() {
  return d;
 }
 public void setD(Dept d) {
  this.d = d;
 }
}
