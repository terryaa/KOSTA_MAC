accept no prompt '奩犒 �蝦� 殮溘:'
declare

begin

	for i in 0 .. &no loop
		if(   mod(i,2) = 0  ) then
			dbms_output.put_line('i高 礎熱'||i);
		else 
			dbms_output.put_line('i高 �汝�'||i);
		end if;
	end loop;
end;
/