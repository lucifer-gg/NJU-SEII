package com.example.cinema.blImpl.sales;

import com.example.cinema.bl.sales.RefundService;
import com.example.cinema.data.sales.RefundMapper;
import com.example.cinema.data.sales.TicketMapper;
import com.example.cinema.po.ConsumeHistory;
import com.example.cinema.vo.RefundForm;
import com.example.cinema.vo.RefundVO;
import com.example.cinema.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RefundServiceImpl implements RefundService {
    @Autowired
    RefundMapper refundMapper;

    @Override
    @Transactional
    public ResponseVO setRefund(RefundForm refundForm){
        try{
            refundMapper.updateRefund(1,refundForm.getTime(),refundForm.getPersent());
            return ResponseVO.buildSuccess();
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }

    @Override
    public ResponseVO getRefund(){
        try{
            return ResponseVO.buildSuccess(new RefundVO(refundMapper.getRefund(1)));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseVO.buildFailure("失败");
        }
    }
}
