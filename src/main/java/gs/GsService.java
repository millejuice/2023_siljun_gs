package gs;

import java.util.List;

public interface GsService {
    public void insertGs(GsVO vo);
    public void updateGs(GsVO vo);
    public void deleteGs(GsVO vo);
    public GsVO getGs(GsVO vo);
    public List<GsVO> getGsList(GsVO vo);
    public void addOneplusone(GsVO vo);
    public void getPriceLimit(GsVO vo);
    public void getExpirationDate(GsVO vo);
    public void getUploadTime(GsVO vo);
    public void getRottenItem(GsVO vo);

}
