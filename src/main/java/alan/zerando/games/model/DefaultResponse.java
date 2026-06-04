package alan.zerando.games.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.domain.Page;



public class DefaultResponse implements Serializable {
    Integer status = 0;
    String  msg = "Operação realizada com sucesso.";
    Object  data = null;
    

    private LocalDateTime dataHora;

    public void setData(Page<?> page) {
        
        this.data = page.getContent();
    }

    public void setData(Object o) {
        this.data = o;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public DefaultResponse() {
    }

    public DefaultResponse(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        
    }

    @Override
    public String toString() {
        return "DefaultResponse [data=" + data + ", msg=" + msg + ", status=" + status + "]";
    }

}