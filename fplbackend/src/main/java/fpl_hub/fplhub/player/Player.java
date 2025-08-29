package fpl_hub.fplhub.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class Player {

    @Id
    @Column(name = "player_name", unique = true, length = 100)
    private String name;
    @Column(length = 255)
    private String nation;
    @Column(name = "position", length = 50)
    private String pos;
    private Integer age;
    @Column(name = "matches_played")
    private Integer mp;
    private Integer starts;
    @Column(name = "minutes_played")
    private Double min;
    @Column(name = "goals")
    private Double gls;
    @Column(name = "assists")
    private Double ast;
    @Column(name = "penalties_scored")
    private Double pk;
    @Column(name = "yellow_cards")
    private Double yc;
    @Column(name = "red_cards")
    private Double rc;
    @Column(name = "expected_goals")
    private Double xg;
    @Column(name = "expected_assists")
    private  Double xa;
    @Column(name = "team_name", length = 100)
    private  String team;

    public Player() {
    }

    public Player(String name, String nation, String pos, Integer age, Integer mp, Integer starts, Double min, Double gls, Double ast, Double pk, Double yc, Double rc, Double xg, Double xa, String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.pk = pk;
        this.yc = yc;
        this.rc = rc;
        this.xg = xg;
        this.xa = xa;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public Double getGls() {
        return gls;
    }

    public void setGls(double gls) {
        this.gls = gls;
    }

    public Double getAst() {
        return ast;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(double pk) {
        this.pk = pk;
    }

    public Double getYc() {
        return yc;
    }

    public void setYc(double yc) {
        this.yc = yc;
    }

    public Double getRc() {
        return rc;
    }

    public void setRc(double rc) {
        this.rc = rc;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public Double getXa() {
        return xa;
    }

    public void setXa(double xa) {
        this.xa = xa;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
