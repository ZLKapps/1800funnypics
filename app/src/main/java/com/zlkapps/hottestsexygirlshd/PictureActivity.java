package com.zlkapps.hottestsexygirlshd;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.io.IOException;
import java.util.*;
import java.lang.*;

public class PictureActivity extends AppCompatActivity {
    ArrayList<String> links = new ArrayList<String>(Arrays.asList("http://i.imgur.com/aYG0DtF.jpg", "http://i.imgur.com/ryJ9CDn.jpg", "http://i.imgur.com/bwRtssm.jpg", "https://i.imgur.com/buRRYGv.jpg", "http://i.imgur.com/FldBsZ7.jpg", "http://i.imgur.com/8Bl5szu.jpg", "http://i.imgur.com/7AUg1XZ.jpg", "http://i.imgur.com/Ae0Ru0S.jpg", "http://i.imgur.com/GVWRoDS.jpg", "http://i.imgur.com/i19cNnm.jpg", "http://i.imgur.com/DnOhaP6.jpg", "http://i.imgur.com/D7Ng8yO.jpg", "http://i.imgur.com/xS6Arxm.jpg", "http://i.imgur.com/HMXgJ2X.jpg", "http://i.imgur.com/mzxEuhj.jpg", "http://i.imgur.com/FhguHJ4.jpg", "http://i.imgur.com/LIMeZV4.jpg", "http://i.imgur.com/qwT6FC7.jpg", "http://i.imgur.com/NwAVPiR.jpg", "http://i.imgur.com/XZCA84d.jpg", "http://i.imgur.com/9JpQQN9.jpg", "http://i.imgur.com/htK7SXD.jpg", "http://i.imgur.com/NlpJ4Mb.jpg", "http://i.imgur.com/9cV2NOv.jpg", "http://i.imgur.com/bicsFzR.jpg", "http://i.imgur.com/hC3gMk5.jpg", "http://i.imgur.com/PdxwaoG.jpg", "http://i.imgur.com/ofiitof.jpg", "http://i.imgur.com/X5YYUop.jpg", "http://i.imgur.com/WDxrHoz.jpg", "http://i.imgur.com/qF9RvyA.jpg", "http://i.imgur.com/d2Y8xO1.jpg", "http://i.imgur.com/vJKhJK4.jpg", "http://i.imgur.com/iFHZJPa.jpg", "http://i.imgur.com/u2s0Sbv.jpg", "http://i.imgur.com/C6SvQ5K.jpg", "http://i.imgur.com/qOSBwgv.jpg", "http://i.imgur.com/X9EzCas.jpg", "http://i.imgur.com/AM0E5Er.jpg", "http://i.imgur.com/5ldxhlx.jpg", "http://i.imgur.com/OecUjxM.jpg", "http://i.imgur.com/EWesHp7.jpg", "http://i.imgur.com/gSpqy8f.jpg", "http://i.imgur.com/lTuekIK.jpg", "http://i.imgur.com/wZxVcKn.jpg", "http://i.imgur.com/R8jpFvO.jpg", "http://i.imgur.com/M6MgvMr.jpg", "http://i.imgur.com/0zqzLXl.jpg", "http://i.imgur.com/EJBbzvU.jpg", "http://i.imgur.com/w91gZS0.jpg", "http://i.imgur.com/ufOqzEz.jpg", "http://i.imgur.com/EE8hA8Q.jpg", "http://i.imgur.com/wett4R5.jpg", "http://i.imgur.com/3lB5lIe.jpg", "http://i.imgur.com/Gascbdh.jpg", "http://i.imgur.com/WDewx3M.jpg", "http://i.imgur.com/hfmAIjS.jpg", "http://i.imgur.com/Pd2Li8g.jpg", "http://i.imgur.com/JnHH6OX.jpg", "http://i.imgur.com/6Y9tQ6i.jpg", "http://i.imgur.com/emPs0my.jpg", "http://i.imgur.com/Ts0Fvs4.jpg", "http://i.imgur.com/lCPcZps.jpg", "http://i.imgur.com/AYUHEAT.jpg", "http://i.imgur.com/cnxAlAQ.jpg", "http://i.imgur.com/zJmpq5S.jpg", "http://i.imgur.com/Krscd5f.jpg", "http://i.imgur.com/jEqyU2T.jpg", "http://40.media.tumblr.com/730046670003803619202d14110aa87f/tumblr_nuszfwqbkR1uv6qiyo3_1280.jpg", "http://i.imgur.com/WvIwYK8.jpg", "http://40.media.tumblr.com/3f90128d3f8b4815eff0534222a8f369/tumblr_nukukwe8fb1uv6ri7o2_1280.jpg", "http://40.media.tumblr.com/a868ace48b336f18e8ed18df3da1a4eb/tumblr_nukugrI8Ap1uv6ri7o1_1280.jpg", "https://i.imgur.com/l59eTr4.jpg", "http://i.imgur.com/RwNMlIm.jpg", "http://i.imgur.com/hD4J9Yb.jpg", "http://i.imgur.com/fz781RL.jpg", "http://40.media.tumblr.com/d3467b34be1fbd850e914659e7ef7a9a/tumblr_nuredbOvtN1usqleno1_1280.png", "http://40.media.tumblr.com/94f142070e0be20108fc71b5c2f56069/tumblr_nuxplcUofM1sg0qvmo1_1280.jpg", "http://i.imgur.com/3e1OWR5.jpg", "http://i.imgur.com/wZNyjpR.jpg", "http://i.imgur.com/rF7DOX8.jpg", "http://i.imgur.com/hQbWj58.jpg", "http://i.imgur.com/xxcaazE.jpg", "http://40.media.tumblr.com/c9391d909f758cf879fb98331a57889d/tumblr_nn3ihwCtys1u9zcwdo3_1280.jpg", "http://i.imgur.com/FYjQ6bk.jpg", "http://i.imgur.com/eWMMDzr.jpg", "http://41.media.tumblr.com/e966885269318d346767e2fa7c14a748/tumblr_nv3wgmE10p1sg0qvmo1_1280.jpg", "http://i.imgur.com/nEO9Q2L.jpg", "http://i.imgur.com/eYHQlQd.jpg", "http://40.media.tumblr.com/d0135c8e7b7945e5359eac896a826315/tumblr_nmkvckhc3e1u9zcwdo2_1280.jpg", "http://41.media.tumblr.com/7243ddc3ce1d28339c8b68a084951759/tumblr_nucictQjnG1u9zcwdo7_1280.jpg", "http://40.media.tumblr.com/c18e8a4b892152f33122bab55e658b3d/tumblr_nmti11Ymel1u9zcwdo3_1280.jpg", "http://40.media.tumblr.com/a7410f2ddcc7e5ef95f180635ed79ee7/tumblr_nv4183by4W1sg0qvmo2_1280.jpg", "http://i.imgur.com/zJGsiOn.jpg", "http://41.media.tumblr.com/1bceb6e00d828ed60cb1827458bf892b/tumblr_nv9iu7T4kq1uddq4wo1_1280.jpg", "http://40.media.tumblr.com/a4618310a05a9a1c717691874d1dc80e/tumblr_nv9njg2MvM1tpwu3zo4_1280.jpg", "http://41.media.tumblr.com/3df93e2c2bd60d13abfc305bd4f6813e/tumblr_nrlukd3Vga1tv93iqo1_1280.jpg", "http://i.imgur.com/AEqnxkn.jpg", "http://i.imgur.com/qfb1p6z.jpg", "http://i.imgur.com/1TXjdyT.jpg", "http://41.media.tumblr.com/b881e695a03829db9977e801a8fbe834/tumblr_mvz12gadbw1rtmw2wo1_1280.jpg", "http://i.imgur.com/ghTTyfP.jpg", "http://i.imgur.com/kEkb9FC.jpg", "http://i.imgur.com/aBUOV6K.jpg", "http://i.imgur.com/M8HdN1S.jpg", "http://i.imgur.com/aHmmjcl.jpg", "http://i.imgur.com/wvZw8OW.jpg", "http://i.imgur.com/Sbj0Za6.jpg", "http://i.imgur.com/BoQSyLo.jpg", "http://36.media.tumblr.com/2585beca43e57b8772ca23bc6a7332c9/tumblr_nvutaqZqU51uv6ri7o2_1280.jpg", "http://40.media.tumblr.com/24de2e1dc3c85e799c0f1b7dcdaaa2cc/tumblr_nvwq82wbcb1u3b8iao1_1280.png", "http://i.imgur.com/QtJUeDU.jpg", "http://i.imgur.com/1B6W0Dh.jpg", "http://i.imgur.com/QY2RcfJ.jpg", "http://i.imgur.com/5StYbKm.jpg", "http://i.imgur.com/JHA8VHI.jpg", "http://i.imgur.com/6FG3pG2.jpg", "http://i.imgur.com/Ld5oAtB.jpg", "http://i.imgur.com/jk9As3Q.jpg", "http://i.imgur.com/TsfLMW1.jpg", "http://i.imgur.com/xvMEsnH.jpg", "http://i.imgur.com/CSH05Zh.jpg", "http://i.imgur.com/nBWLMK9.jpg", "http://i.imgur.com/L0mkJKs.jpg", "http://i.imgur.com/M7TIMQa.jpg", "http://i.imgur.com/Tgsbdsk.jpg", "http://i.imgur.com/q27oVkQ.jpg", "http://i.imgur.com/u89nLC0.jpg", "http://41.media.tumblr.com/3640a19976bb4e8a1bbb852673d2e6e1/tumblr_nw9uzv9Oe51skuftso1_1280.jpg", "http://i.imgur.com/Hm47ZPJ.jpg", "http://i.imgur.com/UtRibZb.jpg", "http://41.media.tumblr.com/47c356f6cbca968e4e9cf494e925afc4/tumblr_nwfxqhhJqv1tm2olto2_1280.jpg", "http://i.imgur.com/wYIUIET.jpg", "http://i.imgur.com/yan8TH3.jpg", "https://36.media.tumblr.com/5dc295dca11d0d4d143690c33b44574e/tumblr_nwnp5nrcWz1uddq4wo1_1280.jpg", "http://i.imgur.com/VgNj0p9.jpg", "http://i.imgur.com/BHRSHg1.jpg", "http://i.imgur.com/3qlN9ar.jpg", "http://i.imgur.com/QMvoo.jpg", "http://i.imgur.com/qwABC0C.jpg", "http://i.imgur.com/GmIym5J.jpg", "http://i.imgur.com/sFo6OPh.jpg", "http://i.imgur.com/e6NekPi.jpg", "http://41.media.tumblr.com/7f98039697cf5e2914321cc8263a6a48/tumblr_niksgg6JY21qcm2kso1_1280.jpg", "http://i.imgur.com/hY60EWK.jpg", "http://40.media.tumblr.com/e9742e1e2da6b49dd8718a0bc366fb10/tumblr_nwuunuo8Xz1u9zcwdo1_1280.jpg", "http://i.imgur.com/2Qrpwlr.jpg", "http://i.imgur.com/XfUHkuT.jpg", "http://i.imgur.com/fCtbwFq.jpg", "http://i.imgur.com/zosZNQf.jpg", "http://i.imgur.com/bnumpPe.jpg", "http://i.imgur.com/EWsEowv.jpg", "http://i.imgur.com/G79ECsu.jpg", "http://i.imgur.com/5rsRWpW.jpg", "http://i.imgur.com/QGr2Qr2.jpg", "http://i.imgur.com/NvDEnQr.jpg", "http://i.imgur.com/BGyoIoQ.jpg", "http://i.imgur.com/Uaqg64i.jpg", "http://i.imgur.com/iig4Sme.jpg", "http://i.imgur.com/Rwzxt6P.jpg", "http://i.imgur.com/s8kWb2p.jpg", "http://i.imgur.com/RcpVx70.jpg", "http://i.imgur.com/ufAadEZ.jpg", "http://i.imgur.com/fQHGwZ5.jpg", "http://i.imgur.com/eu6Mt8n.jpg", "http://i.imgur.com/lTrbwmf.jpg", "http://i.imgur.com/VjH1Hi5.jpg", "http://i.imgur.com/51cuyHX.jpg", "http://i.imgur.com/LzpBop9.jpg", "http://i.imgur.com/Qvfz90u.jpg", "https://i.imgur.com/U9uDDPN.jpg", "http://i.imgur.com/JYxxXnI.jpg", "https://i.imgur.com/x41iOsI.jpg", "http://i.imgur.com/Ff2J4dM.jpg", "http://i.imgur.com/pzZ42Ed.jpg", "http://i.imgur.com/10Z7WtE.jpg", "http://i.imgur.com/DDo3Q8Q.jpg", "http://41.media.tumblr.com/31b5c982e8e65c78237b97a9c4428aa2/tumblr_nuzvxo9FgI1r7ox1ho2_1280.jpg", "http://i.imgur.com/g0GuHfk.jpg", "http://i.imgur.com/kpsIGgp.jpg", "http://i.imgur.com/TmCHq4k.jpg", "http://i.imgur.com/A0ofuVW.jpg", "http://i.imgur.com/WzcAfmO.jpg", "http://i.imgur.com/wVIpzvx.jpg", "http://i.imgur.com/x66rFxM.jpg", "http://i.imgur.com/vh1w1VG.jpg", "http://i.imgur.com/5FC3pRg.jpg", "http://i.imgur.com/egr6lnz.jpg", "http://i.imgur.com/55vPeSZ.jpg", "http://i.imgur.com/LlISRkT.jpg", "http://i.imgur.com/zgkqnCm.jpg", "http://i.imgur.com/gZNdmvE.jpg", "http://i.imgur.com/V3QIeOs.jpg", "http://i.imgur.com/vbBfRCs.jpg", "http://i.imgur.com/eP2EsQP.jpg", "http://i.imgur.com/LYj0t0S.jpg", "http://i.imgur.com/qzWdJux.jpg", "http://i.imgur.com/BpB6BAZ.jpg", "http://i.imgur.com/iVxJDs0.jpg", "http://i.imgur.com/Dby4MjP.jpg", "http://i.imgur.com/Y7T58tt.jpg", "http://i.imgur.com/qbaP5Ao.jpg", "http://i.imgur.com/fvQQflA.jpg", "http://i.imgur.com/oe1EEkD.jpg", "http://i.imgur.com/Fs3ICgz.jpg", "http://i.imgur.com/7SH8tGJ.jpg", "http://i.imgur.com/4emnEh7.jpg", "http://i.imgur.com/wABR8Wt.jpg", "http://i.imgur.com/DTlHPCM.jpg", "http://i.imgur.com/Wvlf2YQ.jpg", "http://i.imgur.com/90vIowz.jpg", "http://i.imgur.com/IOThAaR.jpg", "http://i.imgur.com/3rMAkHH.jpg", "http://i.imgur.com/yTMdPRk.jpg", "http://i.imgur.com/ZtOolBv.jpg", "http://i.imgur.com/cfruOyt.jpg", "http://i.imgur.com/ceMsiw8.jpg", "http://i.imgur.com/DCtOLO0.jpg", "http://i.imgur.com/6GMz6Lb.jpg", "http://i.imgur.com/H0gbVOh.jpg", "http://i.imgur.com/SKU8Qf1.jpg", "http://i.imgur.com/UWPPtZi.jpg", "http://i.imgur.com/nBDNZNA.jpg", "http://i.imgur.com/MoiSwGJ.jpg", "http://i.imgur.com/cJnYmsb.jpg", "http://i.imgur.com/gtRORMB.jpg", "http://i.imgur.com/BGrPrTc.jpg", "http://i.imgur.com/hkvXasY.jpg", "http://i.imgur.com/PgTJpEX.jpg", "http://i.imgur.com/8fCCpTl.jpg", "http://i.imgur.com/TTRJYaj.jpg", "http://i.imgur.com/VU8UGRn.jpg", "http://i.imgur.com/nzssM9J.jpg", "http://i.imgur.com/l4BEQWb.jpg", "http://i.imgur.com/rWPEAln.jpg", "http://i.imgur.com/KS5Euv7.jpg", "http://i.imgur.com/MuvgB06.jpg", "http://i.imgur.com/CS0NaFD.jpg", "http://i.imgur.com/HMA9UUl.jpg", "http://i.imgur.com/ZxJeNua.jpg", "http://i.imgur.com/UriktiT.jpg", "http://i.imgur.com/QimPPRw.jpg", "http://i.imgur.com/y1ixzzY.jpg", "http://i.imgur.com/Nguv1EC.jpg", "http://i.imgur.com/W4nWARg.jpg", "http://i.imgur.com/shpPAgj.jpg", "http://i.imgur.com/50Trztq.jpg", "http://i.imgur.com/vaKtHev.jpg", "http://i.imgur.com/2C0eqMb.jpg", "http://i.imgur.com/0gwWZwo.jpg", "http://i.imgur.com/66kJafc.jpg", "http://i.imgur.com/YX3ZTbl.jpg", "http://i.imgur.com/91M21sr.jpg", "http://i.imgur.com/J1aiMIX.jpg", "http://i.imgur.com/PHYyx0Q.jpg", "http://i.imgur.com/vlR97ks.jpg", "http://i.imgur.com/FfrT9Hq.jpg", "http://i.imgur.com/jhT0MEI.jpg", "http://i.imgur.com/NpThiGO.jpg", "http://i.imgur.com/3Vs4RWL.jpg", "http://i.imgur.com/CF6EnSw.jpg", "http://i.imgur.com/NVpjzxd.jpg", "http://i.imgur.com/a2BhkZb.jpg", "http://i.imgur.com/vLe0Ukz.jpg", "http://i.imgur.com/IY8vx21.jpg", "http://i.imgur.com/zwQQrSb.jpg", "http://i.imgur.com/bMArSIr.jpg", "http://i.imgur.com/Bes7Yz2.jpg", "http://i.imgur.com/yoKNMqr.jpg", "http://i.imgur.com/XJxekp4.jpg", "http://i.imgur.com/sCOhEXC.jpg", "http://i.imgur.com/KQ085Ud.jpg", "http://i.imgur.com/pTFfIJy.jpg", "http://i.imgur.com/816N38K.jpg", "http://i.imgur.com/USKv7XW.jpg", "http://i.imgur.com/gVTlZft.jpg", "http://i.imgur.com/KtonvCK.jpg", "http://i.imgur.com/ndPgqve.jpg", "http://i.imgur.com/Pugqo3J.jpg", "http://i.imgur.com/TzEz0HQ.jpg", "http://i.imgur.com/RjvSFrZ.jpg", "http://i.imgur.com/b0Vs1pP.jpg", "http://i.imgur.com/PcMNVR9.jpg", "http://i.imgur.com/LQmWpX3.jpg", "http://i.imgur.com/UKphBZl.jpg", "http://i.imgur.com/qBeCOFJ.jpg", "http://i.imgur.com/PPk5LSV.jpg", "http://i.imgur.com/Su3YRFi.jpg", "http://i.imgur.com/mmcc8LP.jpg", "http://i.imgur.com/1vS3CSy.jpg", "http://i.imgur.com/pkV5Gu0.jpg", "http://i.imgur.com/ZIP64IV.jpg", "http://i.imgur.com/o39Soj1.jpg", "http://i.imgur.com/84UDHto.jpg", "http://i.imgur.com/QTgO3Q3.jpg", "http://i.imgur.com/JimoFfH.jpg", "http://i.imgur.com/Ta5WT5Q.jpg", "http://i.imgur.com/dVxT4ZZ.jpg", "http://i.imgur.com/27PZqGS.jpg", "http://i.imgur.com/uPeW4Vg.jpg", "http://i.imgur.com/hyyxZoB.jpg", "http://i.imgur.com/JqA6JNM.jpg", "http://i.imgur.com/edf6J7K.jpg", "http://i.imgur.com/6OXxkIm.jpg", "http://i.imgur.com/EGgUSq4.jpg", "http://i.imgur.com/wqUPGTM.jpg", "http://i.imgur.com/a5OQ1AF.jpg", "http://i.imgur.com/eqGPO9y.jpg", "http://i.imgur.com/HoMOUby.jpg", "http://i.imgur.com/JHUAbyU.jpg", "http://i.imgur.com/wTggoOr.jpg", "http://i.imgur.com/GE4Lsbe.jpg", "http://i.imgur.com/JxM40nA.jpg", "http://i.imgur.com/1kEOqax.jpg", "http://i.imgur.com/V20LV54.jpg", "http://i.imgur.com/GdhW0Bs.jpg", "http://i.imgur.com/mInbhqV.jpg", "http://i.imgur.com/dLjLyrW.jpg", "http://i.imgur.com/H4GyXpZ.jpg", "http://i.imgur.com/Y4LjCEf.jpg", "http://i.imgur.com/PIF6FhV.jpg", "http://i.imgur.com/Mnn2G8e.jpg", "http://i.imgur.com/Si7F4lI.jpg", "http://i.imgur.com/k5gDoq4.jpg", "http://i.imgur.com/LuSPiVC.jpg", "http://i.imgur.com/mHYXcmA.jpg", "http://i.imgur.com/JjrtdXn.jpg", "https://i.imgur.com/zEKAmsU.jpg", "https://i.imgur.com/s7XFud1.jpg", "https://i.imgur.com/fyJIDvL.jpg", "https://i.imgur.com/5hGF5wf.jpg", "http://i.imgur.com/uOfSLu5.jpg", "http://i.imgur.com/7BLVCp7.jpg", "http://i.imgur.com/jjNFhye.jpg", "http://i.imgur.com/6ozMEnn.jpg", "http://i.imgur.com/6KkN2FI.jpg", "http://i.imgur.com/OLO7n2L.jpg", "http://i.imgur.com/LdgIOJl.jpg", "http://i.imgur.com/98D7hKC.jpg", "http://i.imgur.com/BIq4GOp.jpg", "http://i.imgur.com/RVw3aHF.jpg", "http://i.imgur.com/u4QXF0A.jpg", "http://i.imgur.com/xUwkeGd.jpg", "http://i.imgur.com/1cH5vfQ.jpg", "http://i.imgur.com/hkFRGyV.jpg", "http://i.imgur.com/ul4meIG.jpg", "http://i.imgur.com/HlCd8ME.jpg", "http://i.imgur.com/F2Y4oLi.jpg", "http://i.imgur.com/pTJojY9.jpg", "http://i.imgur.com/XvSE0YQ.jpg", "http://i.imgur.com/VLGUVZE.jpg", "http://i.imgur.com/MlQlJF7.jpg", "http://i.imgur.com/63EQkQI.jpg", "https://i.imgur.com/bjE9tOr.jpg", "http://i.imgur.com/3hoFkAY.jpg", "http://i.imgur.com/UAsGMwT.jpg", "http://i.imgur.com/Oi60b74.jpg", "http://i.imgur.com/fQjSeyY.jpg", "http://i.imgur.com/9uQ7il7.jpg", "http://i.imgur.com/lMTRDGs.jpg", "http://i.imgur.com/soa71vf.jpg", "http://i.imgur.com/zPVkW4f.jpg", "http://i.imgur.com/2yAXWwB.jpg", "http://i.imgur.com/bLLC52Z.jpg", "http://i.imgur.com/qfFntES.jpg", "http://i.imgur.com/6RdOF4K.jpg", "http://i.imgur.com/GYmhg9G.jpg", "http://i.imgur.com/7ThHDuj.jpg", "http://i.imgur.com/lLkLd3b.jpg", "http://i.imgur.com/6Q5midJ.jpg", "http://i.imgur.com/UH9CTeC.jpg", "http://i.imgur.com/OhtztSb.jpg", "http://i.imgur.com/pbsNDeW.jpg", "http://i.imgur.com/HnnlMZv.jpg", "http://i.imgur.com/r0zIp6j.jpg","http://i.imgur.com/r0zIp6j.jpg"));
    // Set current position to beginning of list
    int current = 0;
    int counter = 0;
    WebView webview;

    public static boolean isDownloadManagerAvailable(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            return true;
        }
        return false;
    }

    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        Collections.shuffle(links);

        //Banner Ads
        AdView mAdView = (AdView) findViewById(R.id.ad);
        AdView mAdView2 = (AdView) findViewById(R.id.ad2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView2.loadAd(adRequest);

        //Interstitial Ads
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("@string/interstitial_ad_pic");
        requestNewInterstitial();

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                nextPicture();
            }
            @Override
            public void onAdLoaded() {
                System.out.println("loaded ad");
            }
        });

        //Image viewer
        webview = (WebView) findViewById(R.id.webView);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.setBackgroundColor(0x00000000);
        webview.getSettings().setUserAgentString("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");

        //Set initial picture
        webview.loadUrl(links.get(current));
    }

    private void nextPicture(){
        // Displays next picture as long as it is not the last picture
        if(current != links.size() - 1) {
            ++current;
            webview.loadUrl(links.get(current));
        }
    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_Alley_CAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    public void prev(View view) {
        // Displays previous picture as long as it is not the 1st picture
        if (current != 0){
            --current;
            webview.loadUrl(links.get(current));
        }
    }

    public void dl(View view) throws IOException {
        String url = links.get(current);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        String[] split = url.split("/");
        String filename = split[split.length - 1];
        request.setTitle(filename);
        request.setDescription("Sexy Photos");
        // in order for this if to run, you must use the android 3.2 to compile your app
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        }
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES + "/sexypics/", filename);

        // get download service and enqueue file
        DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);
        Toast.makeText(getApplicationContext(), "Photo Downloaded Successfully!", Toast.LENGTH_LONG).show();
    }

    public void share(View view) {
        // Shares the current photo
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, links.get(current));
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
        System.out.println("share"); // test to see if button is being called
    }

    public void next(View view){
        // Goes to next photo, if photo is every 10th photo, shows ad
        if (current % 10 == 0){
            if (current > (counter*10)){
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                    counter++;
                } else {
                    nextPicture();
                }
            }
            else {
                nextPicture();
            }
        }
        else {
            nextPicture();
        }
    }

    public void full(View view){
        // Displays photo full screen
        Intent intent = new Intent(getBaseContext(), Full.class);
        intent.putExtra("link", links.get(current));
        startActivity(intent);
    }

}
