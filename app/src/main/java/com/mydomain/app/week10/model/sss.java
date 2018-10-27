package com.mydomain.app.week10.model;

import java.util.List;

public class sss {


    /**
     * success : true
     * timestamp : 1540624746
     * base : EUR
     * date : 2018-10-27
     * rates : [{"AED":4.196251,"AFN":86.083757,"ALL":124.897941,"AMD":555.160603,"ANG":2.028532,"AOA":350.521246,"ARS":42.006639,"AUD":1.61131,"AWG":2.056403,"AZN":1.945019,"BAM":1.821178,"BBD":2.287519,"BDT":95.76027,"BGN":1.959756,"BHD":0.430543,"BIF":2073.53924,"BMD":1.142446,"BND":1.611021,"BOB":7.896301,"BRL":4.161707,"BSD":1.130964,"BTC":1.78E-4,"BTN":83.534474,"BWP":12.157956,"BYN":2.414336,"BYR":22391.938902,"BZD":2.297174,"CAD":1.500774,"CDF":1840.480698,"CHF":1.139065,"CLF":0.028615,"CLP":785.550244,"CNY":7.932578,"COP":3634.120288,"CRC":680.921034,"CUC":1.142446,"CUP":30.274815,"CVE":111.237102,"CZK":25.866921,"DJF":203.035928,"DKK":7.475142,"DOP":55.928483,"DZD":136.183984,"EGP":20.421266,"ERN":17.137097,"ETB":32.107157,"EUR":1,"FJD":2.462017,"FKP":0.89112,"GBP":0.89024,"GEL":3.078937,"GGP":0.890541,"GHS":5.541308,"GIP":0.89112,"GMD":56.556828,"GNF":10424.8189,"GTQ":8.854417,"GYD":238.879763,"HKD":8.961631,"HNL":27.544814,"HRK":7.447152,"HTG":81.824833,"HUF":324.889197,"IDR":17354.495239,"ILS":4.232745,"IMP":0.890541,"INR":83.541399,"IQD":1359.510576,"IRR":48102.683437,"ISK":137.562347,"JEP":0.890541,"JMD":153.727956,"JOD":0.810684,"JPY":127.83631,"KES":115.734111,"KGS":79.422384,"KHR":4650.897506,"KMF":493.936907,"KPW":1027.807962,"KRW":1302.788577,"KWD":0.346984,"KYD":0.952394,"KZT":420.786097,"LAK":9756.488063,"LBP":1729.720595,"LKR":197.540751,"LRD":178.878506,"LSL":16.628344,"LTL":3.373346,"LVL":0.691055,"LYD":1.57701,"MAD":10.880545,"MDL":19.600377,"MGA":3998.560914,"MKD":61.865773,"MMK":1810.834248,"MNT":2910.783218,"MOP":9.229939,"MRO":407.853568,"MUR":39.750837,"MVR":17.662645,"MWK":830.723841,"MXN":22.119356,"MYR":4.769756,"MZN":69.237976,"NAD":16.604352,"NGN":414.708241,"NIO":36.791012,"NOK":9.539884,"NPR":134.169272,"NZD":1.754344,"OMR":0.439847,"PAB":1.142617,"PEN":3.819772,"PGK":3.715406,"PHP":61.132706,"PKR":152.528375,"PLN":4.320674,"PYG":6862.6156,"QAR":4.159764,"RON":4.669066,"RSD":118.666278,"RUB":75.047695,"RWF":999.64013,"SAR":4.285433,"SBD":9.374397,"SCR":15.583387,"SDG":53.83034,"SEK":10.43362,"SGD":1.577,"SHP":1.509061,"SLL":9653.667924,"SOS":663.761433,"SRD":8.520405,"STD":24049.170424,"SVC":10.000176,"SYP":588.360005,"SZL":16.628343,"THB":37.697862,"TJS":10.771494,"TMT":3.998561,"TND":3.268885,"TOP":2.617972,"TRY":6.38959,"TTD":7.702085,"TWD":35.390121,"TZS":2618.26158,"UAH":32.308789,"UGX":4300.566502,"USD":1.142446,"UYU":37.598312,"UZS":9385.193141,"VEF":283920.589007,"VND":26682.965561,"VUV":128.874747,"WST":3.047563,"XAF":660.539766,"XAG":0.077709,"XAU":9.26E-4,"XCD":3.087518,"XDR":0.82564,"XOF":667.188763,"XPF":120.242843,"YER":286.011737,"ZAR":16.682113,"ZMK":10283.387801,"ZMW":13.211287,"ZWL":368.273149}]
     */

    private boolean success;
    private int timestamp;
    private String base;
    private String date;
    private List<RatesBean> rates;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<RatesBean> getRates() {
        return rates;
    }

    public void setRates(List<RatesBean> rates) {
        this.rates = rates;
    }

    public static class RatesBean {
        /**
         * AED : 4.196251
         * AFN : 86.083757
         * ALL : 124.897941
         * AMD : 555.160603
         * ANG : 2.028532
         * AOA : 350.521246
         * ARS : 42.006639
         * AUD : 1.61131
         * AWG : 2.056403
         * AZN : 1.945019
         * BAM : 1.821178
         * BBD : 2.287519
         * BDT : 95.76027
         * BGN : 1.959756
         * BHD : 0.430543
         * BIF : 2073.53924
         * BMD : 1.142446
         * BND : 1.611021
         * BOB : 7.896301
         * BRL : 4.161707
         * BSD : 1.130964
         * BTC : 1.78E-4
         * BTN : 83.534474
         * BWP : 12.157956
         * BYN : 2.414336
         * BYR : 22391.938902
         * BZD : 2.297174
         * CAD : 1.500774
         * CDF : 1840.480698
         * CHF : 1.139065
         * CLF : 0.028615
         * CLP : 785.550244
         * CNY : 7.932578
         * COP : 3634.120288
         * CRC : 680.921034
         * CUC : 1.142446
         * CUP : 30.274815
         * CVE : 111.237102
         * CZK : 25.866921
         * DJF : 203.035928
         * DKK : 7.475142
         * DOP : 55.928483
         * DZD : 136.183984
         * EGP : 20.421266
         * ERN : 17.137097
         * ETB : 32.107157
         * EUR : 1
         * FJD : 2.462017
         * FKP : 0.89112
         * GBP : 0.89024
         * GEL : 3.078937
         * GGP : 0.890541
         * GHS : 5.541308
         * GIP : 0.89112
         * GMD : 56.556828
         * GNF : 10424.8189
         * GTQ : 8.854417
         * GYD : 238.879763
         * HKD : 8.961631
         * HNL : 27.544814
         * HRK : 7.447152
         * HTG : 81.824833
         * HUF : 324.889197
         * IDR : 17354.495239
         * ILS : 4.232745
         * IMP : 0.890541
         * INR : 83.541399
         * IQD : 1359.510576
         * IRR : 48102.683437
         * ISK : 137.562347
         * JEP : 0.890541
         * JMD : 153.727956
         * JOD : 0.810684
         * JPY : 127.83631
         * KES : 115.734111
         * KGS : 79.422384
         * KHR : 4650.897506
         * KMF : 493.936907
         * KPW : 1027.807962
         * KRW : 1302.788577
         * KWD : 0.346984
         * KYD : 0.952394
         * KZT : 420.786097
         * LAK : 9756.488063
         * LBP : 1729.720595
         * LKR : 197.540751
         * LRD : 178.878506
         * LSL : 16.628344
         * LTL : 3.373346
         * LVL : 0.691055
         * LYD : 1.57701
         * MAD : 10.880545
         * MDL : 19.600377
         * MGA : 3998.560914
         * MKD : 61.865773
         * MMK : 1810.834248
         * MNT : 2910.783218
         * MOP : 9.229939
         * MRO : 407.853568
         * MUR : 39.750837
         * MVR : 17.662645
         * MWK : 830.723841
         * MXN : 22.119356
         * MYR : 4.769756
         * MZN : 69.237976
         * NAD : 16.604352
         * NGN : 414.708241
         * NIO : 36.791012
         * NOK : 9.539884
         * NPR : 134.169272
         * NZD : 1.754344
         * OMR : 0.439847
         * PAB : 1.142617
         * PEN : 3.819772
         * PGK : 3.715406
         * PHP : 61.132706
         * PKR : 152.528375
         * PLN : 4.320674
         * PYG : 6862.6156
         * QAR : 4.159764
         * RON : 4.669066
         * RSD : 118.666278
         * RUB : 75.047695
         * RWF : 999.64013
         * SAR : 4.285433
         * SBD : 9.374397
         * SCR : 15.583387
         * SDG : 53.83034
         * SEK : 10.43362
         * SGD : 1.577
         * SHP : 1.509061
         * SLL : 9653.667924
         * SOS : 663.761433
         * SRD : 8.520405
         * STD : 24049.170424
         * SVC : 10.000176
         * SYP : 588.360005
         * SZL : 16.628343
         * THB : 37.697862
         * TJS : 10.771494
         * TMT : 3.998561
         * TND : 3.268885
         * TOP : 2.617972
         * TRY : 6.38959
         * TTD : 7.702085
         * TWD : 35.390121
         * TZS : 2618.26158
         * UAH : 32.308789
         * UGX : 4300.566502
         * USD : 1.142446
         * UYU : 37.598312
         * UZS : 9385.193141
         * VEF : 283920.589007
         * VND : 26682.965561
         * VUV : 128.874747
         * WST : 3.047563
         * XAF : 660.539766
         * XAG : 0.077709
         * XAU : 9.26E-4
         * XCD : 3.087518
         * XDR : 0.82564
         * XOF : 667.188763
         * XPF : 120.242843
         * YER : 286.011737
         * ZAR : 16.682113
         * ZMK : 10283.387801
         * ZMW : 13.211287
         * ZWL : 368.273149
         */

        private double AED;
        private double AFN;
        private double ALL;
        private double AMD;
        private double ANG;
        private double AOA;
        private double ARS;
        private double AUD;
        private double AWG;
        private double AZN;
        private double BAM;
        private double BBD;
        private double BDT;
        private double BGN;
        private double BHD;
        private double BIF;
        private double BMD;
        private double BND;
        private double BOB;
        private double BRL;
        private double BSD;
        private double BTC;
        private double BTN;
        private double BWP;
        private double BYN;
        private double BYR;
        private double BZD;
        private double CAD;
        private double CDF;
        private double CHF;
        private double CLF;
        private double CLP;
        private double CNY;
        private double COP;
        private double CRC;
        private double CUC;
        private double CUP;
        private double CVE;
        private double CZK;
        private double DJF;
        private double DKK;
        private double DOP;
        private double DZD;
        private double EGP;
        private double ERN;
        private double ETB;
        private int EUR;
        private double FJD;
        private double FKP;
        private double GBP;
        private double GEL;
        private double GGP;
        private double GHS;
        private double GIP;
        private double GMD;
        private double GNF;
        private double GTQ;
        private double GYD;
        private double HKD;
        private double HNL;
        private double HRK;
        private double HTG;
        private double HUF;
        private double IDR;
        private double ILS;
        private double IMP;
        private double INR;
        private double IQD;
        private double IRR;
        private double ISK;
        private double JEP;
        private double JMD;
        private double JOD;
        private double JPY;
        private double KES;
        private double KGS;
        private double KHR;
        private double KMF;
        private double KPW;
        private double KRW;
        private double KWD;
        private double KYD;
        private double KZT;
        private double LAK;
        private double LBP;
        private double LKR;
        private double LRD;
        private double LSL;
        private double LTL;
        private double LVL;
        private double LYD;
        private double MAD;
        private double MDL;
        private double MGA;
        private double MKD;
        private double MMK;
        private double MNT;
        private double MOP;
        private double MRO;
        private double MUR;
        private double MVR;
        private double MWK;
        private double MXN;
        private double MYR;
        private double MZN;
        private double NAD;
        private double NGN;
        private double NIO;
        private double NOK;
        private double NPR;
        private double NZD;
        private double OMR;
        private double PAB;
        private double PEN;
        private double PGK;
        private double PHP;
        private double PKR;
        private double PLN;
        private double PYG;
        private double QAR;
        private double RON;
        private double RSD;
        private double RUB;
        private double RWF;
        private double SAR;
        private double SBD;
        private double SCR;
        private double SDG;
        private double SEK;
        private double SGD;
        private double SHP;
        private double SLL;
        private double SOS;
        private double SRD;
        private double STD;
        private double SVC;
        private double SYP;
        private double SZL;
        private double THB;
        private double TJS;
        private double TMT;
        private double TND;
        private double TOP;
        private double TRY;
        private double TTD;
        private double TWD;
        private double TZS;
        private double UAH;
        private double UGX;
        private double USD;
        private double UYU;
        private double UZS;
        private double VEF;
        private double VND;
        private double VUV;
        private double WST;
        private double XAF;
        private double XAG;
        private double XAU;
        private double XCD;
        private double XDR;
        private double XOF;
        private double XPF;
        private double YER;
        private double ZAR;
        private double ZMK;
        private double ZMW;
        private double ZWL;

        public double getAED() {
            return AED;
        }

        public void setAED(double AED) {
            this.AED = AED;
        }

        public double getAFN() {
            return AFN;
        }

        public void setAFN(double AFN) {
            this.AFN = AFN;
        }

        public double getALL() {
            return ALL;
        }

        public void setALL(double ALL) {
            this.ALL = ALL;
        }

        public double getAMD() {
            return AMD;
        }

        public void setAMD(double AMD) {
            this.AMD = AMD;
        }

        public double getANG() {
            return ANG;
        }

        public void setANG(double ANG) {
            this.ANG = ANG;
        }

        public double getAOA() {
            return AOA;
        }

        public void setAOA(double AOA) {
            this.AOA = AOA;
        }

        public double getARS() {
            return ARS;
        }

        public void setARS(double ARS) {
            this.ARS = ARS;
        }

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getAWG() {
            return AWG;
        }

        public void setAWG(double AWG) {
            this.AWG = AWG;
        }

        public double getAZN() {
            return AZN;
        }

        public void setAZN(double AZN) {
            this.AZN = AZN;
        }

        public double getBAM() {
            return BAM;
        }

        public void setBAM(double BAM) {
            this.BAM = BAM;
        }

        public double getBBD() {
            return BBD;
        }

        public void setBBD(double BBD) {
            this.BBD = BBD;
        }

        public double getBDT() {
            return BDT;
        }

        public void setBDT(double BDT) {
            this.BDT = BDT;
        }

        public double getBGN() {
            return BGN;
        }

        public void setBGN(double BGN) {
            this.BGN = BGN;
        }

        public double getBHD() {
            return BHD;
        }

        public void setBHD(double BHD) {
            this.BHD = BHD;
        }

        public double getBIF() {
            return BIF;
        }

        public void setBIF(double BIF) {
            this.BIF = BIF;
        }

        public double getBMD() {
            return BMD;
        }

        public void setBMD(double BMD) {
            this.BMD = BMD;
        }

        public double getBND() {
            return BND;
        }

        public void setBND(double BND) {
            this.BND = BND;
        }

        public double getBOB() {
            return BOB;
        }

        public void setBOB(double BOB) {
            this.BOB = BOB;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getBSD() {
            return BSD;
        }

        public void setBSD(double BSD) {
            this.BSD = BSD;
        }

        public double getBTC() {
            return BTC;
        }

        public void setBTC(double BTC) {
            this.BTC = BTC;
        }

        public double getBTN() {
            return BTN;
        }

        public void setBTN(double BTN) {
            this.BTN = BTN;
        }

        public double getBWP() {
            return BWP;
        }

        public void setBWP(double BWP) {
            this.BWP = BWP;
        }

        public double getBYN() {
            return BYN;
        }

        public void setBYN(double BYN) {
            this.BYN = BYN;
        }

        public double getBYR() {
            return BYR;
        }

        public void setBYR(double BYR) {
            this.BYR = BYR;
        }

        public double getBZD() {
            return BZD;
        }

        public void setBZD(double BZD) {
            this.BZD = BZD;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCDF() {
            return CDF;
        }

        public void setCDF(double CDF) {
            this.CDF = CDF;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getCLF() {
            return CLF;
        }

        public void setCLF(double CLF) {
            this.CLF = CLF;
        }

        public double getCLP() {
            return CLP;
        }

        public void setCLP(double CLP) {
            this.CLP = CLP;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getCOP() {
            return COP;
        }

        public void setCOP(double COP) {
            this.COP = COP;
        }

        public double getCRC() {
            return CRC;
        }

        public void setCRC(double CRC) {
            this.CRC = CRC;
        }

        public double getCUC() {
            return CUC;
        }

        public void setCUC(double CUC) {
            this.CUC = CUC;
        }

        public double getCUP() {
            return CUP;
        }

        public void setCUP(double CUP) {
            this.CUP = CUP;
        }

        public double getCVE() {
            return CVE;
        }

        public void setCVE(double CVE) {
            this.CVE = CVE;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getDJF() {
            return DJF;
        }

        public void setDJF(double DJF) {
            this.DJF = DJF;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getDOP() {
            return DOP;
        }

        public void setDOP(double DOP) {
            this.DOP = DOP;
        }

        public double getDZD() {
            return DZD;
        }

        public void setDZD(double DZD) {
            this.DZD = DZD;
        }

        public double getEGP() {
            return EGP;
        }

        public void setEGP(double EGP) {
            this.EGP = EGP;
        }

        public double getERN() {
            return ERN;
        }

        public void setERN(double ERN) {
            this.ERN = ERN;
        }

        public double getETB() {
            return ETB;
        }

        public void setETB(double ETB) {
            this.ETB = ETB;
        }

        public int getEUR() {
            return EUR;
        }

        public void setEUR(int EUR) {
            this.EUR = EUR;
        }

        public double getFJD() {
            return FJD;
        }

        public void setFJD(double FJD) {
            this.FJD = FJD;
        }

        public double getFKP() {
            return FKP;
        }

        public void setFKP(double FKP) {
            this.FKP = FKP;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getGEL() {
            return GEL;
        }

        public void setGEL(double GEL) {
            this.GEL = GEL;
        }

        public double getGGP() {
            return GGP;
        }

        public void setGGP(double GGP) {
            this.GGP = GGP;
        }

        public double getGHS() {
            return GHS;
        }

        public void setGHS(double GHS) {
            this.GHS = GHS;
        }

        public double getGIP() {
            return GIP;
        }

        public void setGIP(double GIP) {
            this.GIP = GIP;
        }

        public double getGMD() {
            return GMD;
        }

        public void setGMD(double GMD) {
            this.GMD = GMD;
        }

        public double getGNF() {
            return GNF;
        }

        public void setGNF(double GNF) {
            this.GNF = GNF;
        }

        public double getGTQ() {
            return GTQ;
        }

        public void setGTQ(double GTQ) {
            this.GTQ = GTQ;
        }

        public double getGYD() {
            return GYD;
        }

        public void setGYD(double GYD) {
            this.GYD = GYD;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getHNL() {
            return HNL;
        }

        public void setHNL(double HNL) {
            this.HNL = HNL;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getHTG() {
            return HTG;
        }

        public void setHTG(double HTG) {
            this.HTG = HTG;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getIMP() {
            return IMP;
        }

        public void setIMP(double IMP) {
            this.IMP = IMP;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getIQD() {
            return IQD;
        }

        public void setIQD(double IQD) {
            this.IQD = IQD;
        }

        public double getIRR() {
            return IRR;
        }

        public void setIRR(double IRR) {
            this.IRR = IRR;
        }

        public double getISK() {
            return ISK;
        }

        public void setISK(double ISK) {
            this.ISK = ISK;
        }

        public double getJEP() {
            return JEP;
        }

        public void setJEP(double JEP) {
            this.JEP = JEP;
        }

        public double getJMD() {
            return JMD;
        }

        public void setJMD(double JMD) {
            this.JMD = JMD;
        }

        public double getJOD() {
            return JOD;
        }

        public void setJOD(double JOD) {
            this.JOD = JOD;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getKES() {
            return KES;
        }

        public void setKES(double KES) {
            this.KES = KES;
        }

        public double getKGS() {
            return KGS;
        }

        public void setKGS(double KGS) {
            this.KGS = KGS;
        }

        public double getKHR() {
            return KHR;
        }

        public void setKHR(double KHR) {
            this.KHR = KHR;
        }

        public double getKMF() {
            return KMF;
        }

        public void setKMF(double KMF) {
            this.KMF = KMF;
        }

        public double getKPW() {
            return KPW;
        }

        public void setKPW(double KPW) {
            this.KPW = KPW;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getKWD() {
            return KWD;
        }

        public void setKWD(double KWD) {
            this.KWD = KWD;
        }

        public double getKYD() {
            return KYD;
        }

        public void setKYD(double KYD) {
            this.KYD = KYD;
        }

        public double getKZT() {
            return KZT;
        }

        public void setKZT(double KZT) {
            this.KZT = KZT;
        }

        public double getLAK() {
            return LAK;
        }

        public void setLAK(double LAK) {
            this.LAK = LAK;
        }

        public double getLBP() {
            return LBP;
        }

        public void setLBP(double LBP) {
            this.LBP = LBP;
        }

        public double getLKR() {
            return LKR;
        }

        public void setLKR(double LKR) {
            this.LKR = LKR;
        }

        public double getLRD() {
            return LRD;
        }

        public void setLRD(double LRD) {
            this.LRD = LRD;
        }

        public double getLSL() {
            return LSL;
        }

        public void setLSL(double LSL) {
            this.LSL = LSL;
        }

        public double getLTL() {
            return LTL;
        }

        public void setLTL(double LTL) {
            this.LTL = LTL;
        }

        public double getLVL() {
            return LVL;
        }

        public void setLVL(double LVL) {
            this.LVL = LVL;
        }

        public double getLYD() {
            return LYD;
        }

        public void setLYD(double LYD) {
            this.LYD = LYD;
        }

        public double getMAD() {
            return MAD;
        }

        public void setMAD(double MAD) {
            this.MAD = MAD;
        }

        public double getMDL() {
            return MDL;
        }

        public void setMDL(double MDL) {
            this.MDL = MDL;
        }

        public double getMGA() {
            return MGA;
        }

        public void setMGA(double MGA) {
            this.MGA = MGA;
        }

        public double getMKD() {
            return MKD;
        }

        public void setMKD(double MKD) {
            this.MKD = MKD;
        }

        public double getMMK() {
            return MMK;
        }

        public void setMMK(double MMK) {
            this.MMK = MMK;
        }

        public double getMNT() {
            return MNT;
        }

        public void setMNT(double MNT) {
            this.MNT = MNT;
        }

        public double getMOP() {
            return MOP;
        }

        public void setMOP(double MOP) {
            this.MOP = MOP;
        }

        public double getMRO() {
            return MRO;
        }

        public void setMRO(double MRO) {
            this.MRO = MRO;
        }

        public double getMUR() {
            return MUR;
        }

        public void setMUR(double MUR) {
            this.MUR = MUR;
        }

        public double getMVR() {
            return MVR;
        }

        public void setMVR(double MVR) {
            this.MVR = MVR;
        }

        public double getMWK() {
            return MWK;
        }

        public void setMWK(double MWK) {
            this.MWK = MWK;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }

        public double getMZN() {
            return MZN;
        }

        public void setMZN(double MZN) {
            this.MZN = MZN;
        }

        public double getNAD() {
            return NAD;
        }

        public void setNAD(double NAD) {
            this.NAD = NAD;
        }

        public double getNGN() {
            return NGN;
        }

        public void setNGN(double NGN) {
            this.NGN = NGN;
        }

        public double getNIO() {
            return NIO;
        }

        public void setNIO(double NIO) {
            this.NIO = NIO;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNPR() {
            return NPR;
        }

        public void setNPR(double NPR) {
            this.NPR = NPR;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getOMR() {
            return OMR;
        }

        public void setOMR(double OMR) {
            this.OMR = OMR;
        }

        public double getPAB() {
            return PAB;
        }

        public void setPAB(double PAB) {
            this.PAB = PAB;
        }

        public double getPEN() {
            return PEN;
        }

        public void setPEN(double PEN) {
            this.PEN = PEN;
        }

        public double getPGK() {
            return PGK;
        }

        public void setPGK(double PGK) {
            this.PGK = PGK;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getPKR() {
            return PKR;
        }

        public void setPKR(double PKR) {
            this.PKR = PKR;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getPYG() {
            return PYG;
        }

        public void setPYG(double PYG) {
            this.PYG = PYG;
        }

        public double getQAR() {
            return QAR;
        }

        public void setQAR(double QAR) {
            this.QAR = QAR;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getRSD() {
            return RSD;
        }

        public void setRSD(double RSD) {
            this.RSD = RSD;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getRWF() {
            return RWF;
        }

        public void setRWF(double RWF) {
            this.RWF = RWF;
        }

        public double getSAR() {
            return SAR;
        }

        public void setSAR(double SAR) {
            this.SAR = SAR;
        }

        public double getSBD() {
            return SBD;
        }

        public void setSBD(double SBD) {
            this.SBD = SBD;
        }

        public double getSCR() {
            return SCR;
        }

        public void setSCR(double SCR) {
            this.SCR = SCR;
        }

        public double getSDG() {
            return SDG;
        }

        public void setSDG(double SDG) {
            this.SDG = SDG;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getSHP() {
            return SHP;
        }

        public void setSHP(double SHP) {
            this.SHP = SHP;
        }

        public double getSLL() {
            return SLL;
        }

        public void setSLL(double SLL) {
            this.SLL = SLL;
        }

        public double getSOS() {
            return SOS;
        }

        public void setSOS(double SOS) {
            this.SOS = SOS;
        }

        public double getSRD() {
            return SRD;
        }

        public void setSRD(double SRD) {
            this.SRD = SRD;
        }

        public double getSTD() {
            return STD;
        }

        public void setSTD(double STD) {
            this.STD = STD;
        }

        public double getSVC() {
            return SVC;
        }

        public void setSVC(double SVC) {
            this.SVC = SVC;
        }

        public double getSYP() {
            return SYP;
        }

        public void setSYP(double SYP) {
            this.SYP = SYP;
        }

        public double getSZL() {
            return SZL;
        }

        public void setSZL(double SZL) {
            this.SZL = SZL;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getTJS() {
            return TJS;
        }

        public void setTJS(double TJS) {
            this.TJS = TJS;
        }

        public double getTMT() {
            return TMT;
        }

        public void setTMT(double TMT) {
            this.TMT = TMT;
        }

        public double getTND() {
            return TND;
        }

        public void setTND(double TND) {
            this.TND = TND;
        }

        public double getTOP() {
            return TOP;
        }

        public void setTOP(double TOP) {
            this.TOP = TOP;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getTTD() {
            return TTD;
        }

        public void setTTD(double TTD) {
            this.TTD = TTD;
        }

        public double getTWD() {
            return TWD;
        }

        public void setTWD(double TWD) {
            this.TWD = TWD;
        }

        public double getTZS() {
            return TZS;
        }

        public void setTZS(double TZS) {
            this.TZS = TZS;
        }

        public double getUAH() {
            return UAH;
        }

        public void setUAH(double UAH) {
            this.UAH = UAH;
        }

        public double getUGX() {
            return UGX;
        }

        public void setUGX(double UGX) {
            this.UGX = UGX;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getUYU() {
            return UYU;
        }

        public void setUYU(double UYU) {
            this.UYU = UYU;
        }

        public double getUZS() {
            return UZS;
        }

        public void setUZS(double UZS) {
            this.UZS = UZS;
        }

        public double getVEF() {
            return VEF;
        }

        public void setVEF(double VEF) {
            this.VEF = VEF;
        }

        public double getVND() {
            return VND;
        }

        public void setVND(double VND) {
            this.VND = VND;
        }

        public double getVUV() {
            return VUV;
        }

        public void setVUV(double VUV) {
            this.VUV = VUV;
        }

        public double getWST() {
            return WST;
        }

        public void setWST(double WST) {
            this.WST = WST;
        }

        public double getXAF() {
            return XAF;
        }

        public void setXAF(double XAF) {
            this.XAF = XAF;
        }

        public double getXAG() {
            return XAG;
        }

        public void setXAG(double XAG) {
            this.XAG = XAG;
        }

        public double getXAU() {
            return XAU;
        }

        public void setXAU(double XAU) {
            this.XAU = XAU;
        }

        public double getXCD() {
            return XCD;
        }

        public void setXCD(double XCD) {
            this.XCD = XCD;
        }

        public double getXDR() {
            return XDR;
        }

        public void setXDR(double XDR) {
            this.XDR = XDR;
        }

        public double getXOF() {
            return XOF;
        }

        public void setXOF(double XOF) {
            this.XOF = XOF;
        }

        public double getXPF() {
            return XPF;
        }

        public void setXPF(double XPF) {
            this.XPF = XPF;
        }

        public double getYER() {
            return YER;
        }

        public void setYER(double YER) {
            this.YER = YER;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }

        public double getZMK() {
            return ZMK;
        }

        public void setZMK(double ZMK) {
            this.ZMK = ZMK;
        }

        public double getZMW() {
            return ZMW;
        }

        public void setZMW(double ZMW) {
            this.ZMW = ZMW;
        }

        public double getZWL() {
            return ZWL;
        }

        public void setZWL(double ZWL) {
            this.ZWL = ZWL;
        }
    }
}