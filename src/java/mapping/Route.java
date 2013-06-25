package mapping;
// Generated 25-Jun-2013 09:57:44 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Route generated by hbm2java
 */
public class Route  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String code;
     private Set<Invbook> invbooks = new HashSet<Invbook>(0);
     private Set<Delibook> delibooks = new HashSet<Delibook>(0);
     private Set<Rtn> rtns = new HashSet<Rtn>(0);
     private Set<Deliver> delivers = new HashSet<Deliver>(0);
     private Set<Agent> agents = new HashSet<Agent>(0);
     private Set<Rtnbook> rtnbooks = new HashSet<Rtnbook>(0);

    public Route() {
    }

    public Route(String name, String code, Set<Invbook> invbooks, Set<Delibook> delibooks, Set<Rtn> rtns, Set<Deliver> delivers, Set<Agent> agents, Set<Rtnbook> rtnbooks) {
       this.name = name;
       this.code = code;
       this.invbooks = invbooks;
       this.delibooks = delibooks;
       this.rtns = rtns;
       this.delivers = delivers;
       this.agents = agents;
       this.rtnbooks = rtnbooks;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public Set<Invbook> getInvbooks() {
        return this.invbooks;
    }
    
    public void setInvbooks(Set<Invbook> invbooks) {
        this.invbooks = invbooks;
    }
    public Set<Delibook> getDelibooks() {
        return this.delibooks;
    }
    
    public void setDelibooks(Set<Delibook> delibooks) {
        this.delibooks = delibooks;
    }
    public Set<Rtn> getRtns() {
        return this.rtns;
    }
    
    public void setRtns(Set<Rtn> rtns) {
        this.rtns = rtns;
    }
    public Set<Deliver> getDelivers() {
        return this.delivers;
    }
    
    public void setDelivers(Set<Deliver> delivers) {
        this.delivers = delivers;
    }
    public Set<Agent> getAgents() {
        return this.agents;
    }
    
    public void setAgents(Set<Agent> agents) {
        this.agents = agents;
    }
    public Set<Rtnbook> getRtnbooks() {
        return this.rtnbooks;
    }
    
    public void setRtnbooks(Set<Rtnbook> rtnbooks) {
        this.rtnbooks = rtnbooks;
    }




}


