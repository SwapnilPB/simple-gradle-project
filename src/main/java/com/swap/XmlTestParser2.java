package com.swap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class XmlTestParser2 {

    public static void main(String[] args) {
        String response = "<?xml version=\"1.0\"?>\n" +
                "<XML>\n" +
                "    <MessageType PRE=\"mandatory\" PL=\"4\" MXL=\"4\" MNL=\"4\" LSP=\"0\" DT=\"numeric\" DEFAULT=\"1114\">1114</MessageType>\n" +
                "    <ProcCode PRE=\"mandatory\" PL=\"6\" MXL=\"6\" MNL=\"6\" LSP=\"0\" DT=\"numeric\" DEFAULT=\"911000\" IND=\"3\">91600</ProcCode>\n" +
                "    <STAN PRE=\"mandatory\" PL=\"12\" MXL=\"12\" MNL=\"12\" LSP=\"0\" DT=\"alphabetnumericspaces\" IND=\"11\">202326730610</STAN>\n" +
                "    <LocalTxnDtTime PRE=\"mandatory\" PL=\"14\" MXL=\"14\" MNL=\"14\" LSP=\"0\" DT=\"numeric\" IND=\"12\">20140529202326\n" +
                "    </LocalTxnDtTime>\n" +
                "    <ActCode PRE=\"mandatory\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"39\">130</ActCode>\n" +
                "    <PvtDataField48 PRE=\"optional\" PL=\"200\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"48\"\n" +
                "                    RLI=\"0\">\n" +
                "        <UserID PRE=\"optional\" PL=\"0\" MXL=\"99\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"1\">\n" +
                "            RISHIUAT\n" +
                "        </UserID>\n" +
                "        <AuthNum PRE=\"optional\" PL=\"8\" MXL=\"8\" MNL=\"8\" LSP=\"0\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"2\"/>\n" +
                "        <RelNum PRE=\"optional\" PL=\"10\" MXL=\"10\" MNL=\"10\" LSP=\"0\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"3\">\n" +
                "            3000505980\n" +
                "        </RelNum>\n" +
                "        <CustName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"4\">\n" +
                "            Nikhil Bhosale\n" +
                "        </CustName>\n" +
                "        <DOB PRE=\"optional\" PL=\"8\" MXL=\"8\" MNL=\"8\" LSP=\"0\" DT=\"numeric\" IND=\"48\" RLI=\"23\">19641125</DOB>\n" +
                "        <TPINStat PRE=\"optional\" PL=\"1\" MXL=\"1\" MNL=\"1\" LSP=\"0\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"23\"/>\n" +
                "        <CustType PRE=\"optional\" PL=\"0\" MXL=\"12\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumeric\" IND=\"48\" RLI=\"27\">GB|GB</CustType>\n" +
                "        <LastAccCC PRE=\"optional\" PL=\"8\" MXL=\"8\" MNL=\"8\" LSP=\"0\" DT=\"numeric\" IND=\"48\" RLI=\"23\"/>\n" +
                "        <LastAccInf PRE=\"optional\" PL=\"8\" MXL=\"8\" MNL=\"8\" LSP=\"0\" DT=\"numeric\" IND=\"48\" RLI=\"23\">20160115</LastAccInf>\n" +
                "        <CrossSellMsg PRE=\"optional\" PL=\"8\" MXL=\"8\" MNL=\"8\" LSP=\"0\" DT=\"alphabetnumericspecialspaces\" DEFAULT=\" \"\n" +
                "                      IND=\"48\" RLI=\"23\"/>\n" +
                "        <UIDAddFutAA PRE=\"optional\" PL=\"0\" MXL=\"99\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"48\"\n" +
                "                     RLI=\"1\"></UIDAddFutAA>\n" +
                "        <UIDAddFutBB PRE=\"optional\" PL=\"0\" MXL=\"99\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"48\" RLI=\"1\"/>\n" +
                "    </PvtDataField48>\n" +
                "    <TxnDestnCode PRE=\"mandatory\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"93\">3</TxnDestnCode>\n" +
                "    <TxnOrigCode PRE=\"mandatory\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"94\">8</TxnOrigCode>\n" +
                "    <DeliveryChannelCtrlID PRE=\"mandatory\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"alphabet\" IND=\"123\">IVW\n" +
                "    </DeliveryChannelCtrlID>\n" +
                "    <PvtDataField124 PRE=\"optional\" PL=\"15\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"124\">\n" +
                "        <TotAccLinkedToRelNum PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"124\" RLI=\"1\">41\n" +
                "        </TotAccLinkedToRelNum>\n" +
                "        <TotPTLinkedToAccNum PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"124\" RLI=\"1\" RAL=\"3\">1\n" +
                "        </TotPTLinkedToAccNum>\n" +
                "        <Record>\n" +
                "            <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"124\" RLI=\"2\">2</FsId>\n" +
                "        </Record>\n" +
                "    </PvtDataField124>\n" +
                "    <PvtDataField125 PRE=\"optional\" PL=\"167\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\">\n" +
                "        <NumOfCustID PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\">1</NumOfCustID>\n" +
                "        <Record>\n" +
                "            <CustomerID PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">M3/00000750669\n" +
                "            </CustomerID>\n" +
                "            <NumOfAccounts PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\">41\n" +
                "            </NumOfAccounts>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">1</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">000401008466\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\" RLI=\"3\">PAYPK</BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">000401186841\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">000418015815\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">000715770074\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Ramesh Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000001\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Ramesh Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">Y\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000002\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Ramesh Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000003\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Nikhil Ramesh Bhosale\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000005\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000101\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000156\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701000661\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh$ Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701001987\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh$ Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701015022\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh$ Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701016228\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">[Nikhil Ramesh$ Bhosale]\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701021109\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701026394\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701034500\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701037485\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001701533533\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001708001057\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">0017153079\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001718001396\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001718001398\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001718001409\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001718001488\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001801058865\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001801066661\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">001805500212\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">002518001008\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">002518001009\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">002518001010\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">002518001012\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">003524000251\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">003524000290\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">015224001995\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">020401526969\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">055501505355\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">055501505365\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">055801557425\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\">141901504426\n" +
                "                </AccNum>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\">Deepal\n" +
                "                </AcctName>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\">N\n" +
                "                </BankHomeStatus>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\">N\n" +
                "                </AccountFutAA>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "            <AccountDetails>\n" +
                "                <FsId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RLI=\"2\">2</FsId>\n" +
                "                <AccNum PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\"/>\n" +
                "                <AcctName PRE=\"optional\" PL=\"13\" MXL=\"100\" MNL=\"3\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                          RLI=\"4\"/>\n" +
                "                <BankHomeStatus PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                                IND=\"125\" RLI=\"3\"/>\n" +
                "                <AccountFutAA PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "                <AccountFutBB PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                              RLI=\"3\"/>\n" +
                "            </AccountDetails>\n" +
                "        </Record>\n" +
                "    </PvtDataField125>\n" +
                "    <PvtDataFieldInsurance PRE=\"optional\" PL=\"167\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                           IND=\"125\">\n" +
                "        <LI_FLG PRE=\"optional\" PL=\"3\" MXL=\"1\" MNL=\"1\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\">N</LI_FLG>\n" +
                "        <GI_FLG PRE=\"optional\" PL=\"3\" MXL=\"1\" MNL=\"1\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\">N</GI_FLG>\n" +
                "        <CAR_REF_NUM PRE=\"optional\" PL=\"3\" MXL=\"25\" MNL=\"1\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\"/>\n" +
                "    </PvtDataFieldInsurance>\n" +
                "    <PvtDataFieldInternational PRE=\"optional\" PL=\"167\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\"\n" +
                "                               IND=\"125\">\n" +
                "        <INTL_RELNS PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"1\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\">0</INTL_RELNS>\n" +
                "    </PvtDataFieldInternational>\n" +
                "    <PvtDataFieldFEDID PRE=\"optional\" PL=\"167\" MXL=\"999\" MNL=\"1\" LSP=\"3\" DT=\"alphabetnumericspecialspaces\" IND=\"125\">\n" +
                "        <NoOfProdId PRE=\"optional\" PL=\"\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\"/>\n" +
                "        <ProdIdDetails>\n" +
                "            <ProdId PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"alphabetnumericspecialspaces\" IND=\"125\" RLI=\"2\"/>\n" +
                "            <NumOfFedIDs PRE=\"optional\" PL=\"3\" MXL=\"3\" MNL=\"3\" LSP=\"0\" DT=\"numeric\" IND=\"125\" RAL=\"3\"/>\n" +
                "            <FedIDDetails>\n" +
                "                <NetUserID PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"/>\n" +
                "                <FedID PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"numeric\" IND=\"125\"/>\n" +
                "                <ProdId PRE=\"optional\" PL=\"\" MXL=\"19\" MNL=\"1\" LSP=\"2\" DT=\"alphabetnumericspecialspaces\" IND=\"125\"\n" +
                "                        RLI=\"3\"/>\n" +
                "            </FedIDDetails>\n" +
                "        </ProdIdDetails>\n" +
                "    </PvtDataFieldFEDID>\n" +
                "</XML>";
        response = response.replaceAll("[\\n\\r]", "");
        System.out.println("response ** : " + response);
        InputStream ios = new ByteArrayInputStream(response.getBytes());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        Map<String, String> ribDataValueMap = new HashMap<String, String>();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(ios);
            doc.getDocumentElement().normalize();
            //    Node node = doc.getElementsByTagName("DataValue");


            System.out.println("nodeList length AccountDetails ** : " + doc.getElementsByTagName("AccountDetails").getLength());
            int len = doc.getElementsByTagName("AccountDetails").getLength();
            for (int i = 0; i < len; i++) {
                System.out.println("CAR_TAG_ACCOUNTDETAILS ** : " + doc.getElementsByTagName("AccountDetails").item(i));
                String fsid = "";
                String accNo = "";
                String accType = "";
                String mbeba = "";
                String bankHomeStatus = "";
                boolean found = false;
                fsid = doc.getElementsByTagName("FsId").item(i).getTextContent() != null ? doc.getElementsByTagName("FsId").item(i).getTextContent().replace("\n", "").replace("\r", "").trim() : "";
                System.out.println("fsid : "+ fsid);
                bankHomeStatus = doc.getElementsByTagName("BankHomeStatus").item(i).getTextContent() != null ? doc.getElementsByTagName("BankHomeStatus").item(i).getTextContent().replace("\n", "").replace("\r", "").trim() : "";
                System.out.println("bankHomeStatus : "+ bankHomeStatus);
                accNo = doc.getElementsByTagName("AccNum").item(i).getTextContent() != null ? doc.getElementsByTagName("AccNum").item(i).getTextContent().replace("\n", "").replace("\r", "").trim() : "";
                System.out.println("accNo  : "+accNo);
                String name = doc.getElementsByTagName("AcctName").item(i).getTextContent();
                System.out.println("name  : "+name);
            }
        } catch (Exception e) {

        }

    }
}
