package com.giousa.sqlservermybatis.convert;

import com.giousa.sqlservermybatis.core.model.TBabyDO;
import com.giousa.sqlservermybatis.web.dto.TBabyDTO;
import com.giousa.sqlservermybatis.web.req.TBabyReq;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class TBabyConvert {

    public static TBabyDTO convert(TBabyDO req) {
        if(Objects.isNull(req)){
            return null;
        }
        TBabyDTO tBabyDTO = new TBabyDTO();
        tBabyDTO.setId(req.getId());
        tBabyDTO.setAreaId(req.getAreaId());
        tBabyDTO.setHId(req.getHId());
        tBabyDTO.setName(req.getName());
        tBabyDTO.setSex(req.getSex());
        tBabyDTO.setBirth(req.getBirth());
        tBabyDTO.setIsEchocardiography(req.getIsEchocardiography());
        tBabyDTO.setNumber(req.getNumber());
        tBabyDTO.setMother(req.getMother());
        tBabyDTO.setCardType(req.getCardType());
        tBabyDTO.setMaIdcart(req.getMaIdcart());
        tBabyDTO.setNation(req.getNation());
        tBabyDTO.setCity(req.getCity());
        tBabyDTO.setAddress1(req.getAddress1());
        tBabyDTO.setAddress(req.getAddress());
        tBabyDTO.setGuardian(req.getGuardian());
        tBabyDTO.setMobile(req.getMobile());
        tBabyDTO.setTel(req.getTel());
        tBabyDTO.setGuardianT(req.getGuardianT());
        tBabyDTO.setMobileT(req.getMobileT());
        tBabyDTO.setTelT(req.getTelT());
        tBabyDTO.setGuardianS(req.getGuardianS());
        tBabyDTO.setMobileS(req.getMobileS());
        tBabyDTO.setTelS(req.getTelS());
        tBabyDTO.setMode(req.getMode());
        tBabyDTO.setCreateDate(req.getCreateDate());
        tBabyDTO.setUpdateDate(req.getUpdateDate());
        tBabyDTO.setOperatorId(req.getOperatorId());
        tBabyDTO.setStatus(req.getStatus());
        tBabyDTO.setAgree(req.getAgree());
        tBabyDTO.setStep(req.getStep());
        tBabyDTO.setJscode(req.getJscode());
        tBabyDTO.setJsimg(req.getJsimg());
        tBabyDTO.setAdditional(req.getAdditional());
        tBabyDTO.setFollowup(req.getFollowup());
        tBabyDTO.setFollowupResult(req.getFollowupResult());
        tBabyDTO.setDeleteDate(req.getDeleteDate());
        tBabyDTO.setCreateUser(req.getCreateUser());
        tBabyDTO.setUpdateUser(req.getUpdateUser());
        tBabyDTO.setDeleteUser(req.getDeleteUser());
        tBabyDTO.setScreenId(req.getScreenId());
        tBabyDTO.setDiagnosisId(req.getDiagnosisId());
        tBabyDTO.setTreatId(req.getTreatId());
        tBabyDTO.setDr(req.getDr());
        tBabyDTO.setBStatus(req.getBStatus());
        tBabyDTO.setIssupplement(req.getIssupplement());
        tBabyDTO.setProblem(req.getProblem());
        tBabyDTO.setIsInterface(req.getIsInterface());
        tBabyDTO.setInterFaceId(req.getInterFaceId());
        return tBabyDTO;
    }

    public static TBabyDO convert(TBabyReq req){
        if(Objects.isNull(req)){
            return null;
        }
        TBabyDO tBabyDO = new TBabyDO();
        tBabyDO.setId(req.getId());
        tBabyDO.setAreaId(req.getAreaId());
        tBabyDO.setHId(req.getHId());
        tBabyDO.setName(req.getName());
        tBabyDO.setSex(req.getSex());
        tBabyDO.setBirth(req.getBirth());
        tBabyDO.setIsEchocardiography(req.getIsEchocardiography());
        tBabyDO.setNumber(req.getNumber());
        tBabyDO.setMother(req.getMother());
        tBabyDO.setCardType(req.getCardType());
        tBabyDO.setMaIdcart(req.getMaIdcart());
        tBabyDO.setNation(req.getNation());
        tBabyDO.setCity(req.getCity());
        tBabyDO.setAddress1(req.getAddress1());
        tBabyDO.setAddress(req.getAddress());
        tBabyDO.setGuardian(req.getGuardian());
        tBabyDO.setMobile(req.getMobile());
        tBabyDO.setTel(req.getTel());
        tBabyDO.setGuardianT(req.getGuardianT());
        tBabyDO.setMobileT(req.getMobileT());
        tBabyDO.setTelT(req.getTelT());
        tBabyDO.setGuardianS(req.getGuardianS());
        tBabyDO.setMobileS(req.getMobileS());
        tBabyDO.setTelS(req.getTelS());
        tBabyDO.setMode(req.getMode());
        tBabyDO.setCreateDate(req.getCreateDate());
        tBabyDO.setUpdateDate(req.getUpdateDate());
        tBabyDO.setOperatorId(req.getOperatorId());
        tBabyDO.setStatus(req.getStatus());
        tBabyDO.setAgree(req.getAgree());
        tBabyDO.setStep(req.getStep());
        tBabyDO.setJscode(req.getJscode());
        tBabyDO.setJsimg(req.getJsimg());
        tBabyDO.setAdditional(req.getAdditional());
        tBabyDO.setFollowup(req.getFollowup());
        tBabyDO.setFollowupResult(req.getFollowupResult());
        tBabyDO.setDeleteDate(req.getDeleteDate());
        tBabyDO.setCreateUser(req.getCreateUser());
        tBabyDO.setUpdateUser(req.getUpdateUser());
        tBabyDO.setDeleteUser(req.getDeleteUser());
        tBabyDO.setScreenId(req.getScreenId());
        tBabyDO.setDiagnosisId(req.getDiagnosisId());
        tBabyDO.setTreatId(req.getTreatId());
        tBabyDO.setDr(req.getDr());
        tBabyDO.setBStatus(req.getBStatus());
        tBabyDO.setIssupplement(req.getIssupplement());
        tBabyDO.setProblem(req.getProblem());
        tBabyDO.setIsInterface(req.getIsInterface());
        tBabyDO.setInterFaceId(req.getInterFaceId());
        return tBabyDO;
    }
}

