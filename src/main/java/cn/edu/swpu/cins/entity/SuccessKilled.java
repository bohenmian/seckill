package cn.edu.swpu.cins.entity;

import java.util.Date;

public class SuccessKilled {

    /**
     * 一个秒杀seckill对应多个成功记录
     */
    private Seckill seckill;
    /**
     * 商品库存ID
     */
    private long seckillId;
    /**
     * 用户手机号
     */
    private long userPhone;
    /**
     * 状态标识:-1:无效 0:成功 1:已付款 2:已发货
     */
    private short state;
    /**
     * 创建时间
     */
    private Date createTime;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckill=" + seckill +
                ", seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
